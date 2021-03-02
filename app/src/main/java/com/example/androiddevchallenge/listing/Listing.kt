package com.example.androiddevchallenge.listing

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun MyApp(puppies: List<Puppy>) {
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth()) {
                puppies.forEach { puppy ->
                    PuppyItem(puppy)
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
            .border(width = 1.dp, color = Color.Gray)
            .padding(vertical = 16.dp)
            .fillMaxWidth(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = puppy.name, style = typography.h5)
            Spacer(modifier = Modifier.width(32.dp))
            Text(text = puppy.sex.name, style = typography.body2)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = puppy.breed, style = typography.body2)
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


