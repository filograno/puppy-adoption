package com.example.androiddevchallenge.listing

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun MyApp(puppies: List<Puppy>) {
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            LazyColumn(
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                items(puppies) { puppy ->
                    PuppyItem(puppy)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}

@Composable
fun PuppyItem(puppy: Puppy) {
    Column(
        modifier = Modifier
            .clickable { }
            .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(15.dp))
            .clip(shape = RoundedCornerShape(15.dp))
            .fillMaxWidth(),
    ) {
        Image(
            painter = painterResource(id = puppy.image),
            contentDescription = null,
            modifier = Modifier.height(180.dp).fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Text(text = puppy.name, style = typography.h5)
            Spacer(modifier = Modifier.width(32.dp))
            Text(text = puppy.sex.name, style = typography.body2)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.padding(horizontal = 8.dp),
            text = puppy.breed,
            style = typography.body2
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp(PuppyRepositoryImpl().fetchPuppies())
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp(PuppyRepositoryImpl().fetchPuppies())
    }
}


