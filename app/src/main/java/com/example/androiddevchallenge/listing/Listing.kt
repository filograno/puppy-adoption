/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.listing

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.Sex
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun MyApp(puppies: List<Puppy>, onClick: ((Int) -> Unit)?) {
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            LazyColumn(
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                items(puppies) { puppy ->
                    PuppyItem(puppy, onClick)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}

@Composable
fun PuppyItem(puppy: Puppy, onClick: ((Int) -> Unit)?) {
    Column(
        modifier = Modifier
            .clickable { onClick?.invoke(puppy.id) }
            .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(15.dp))
            .clip(shape = RoundedCornerShape(15.dp))
            .fillMaxWidth(),
    ) {
        Image(
            painter = painterResource(id = puppy.image),
            contentDescription = null,
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Text(text = puppy.name, style = typography.h5)
            Spacer(modifier = Modifier.width(32.dp))
            val sexImage = when (puppy.sex) {
                Sex.MALE -> R.drawable.ic_male
                Sex.FEMALE -> R.drawable.ic_female
            }
            Image(painter = painterResource(id = sexImage), contentDescription = null)
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            modifier = Modifier.padding(horizontal = 8.dp),
            text = puppy.breed,
            style = typography.body2
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp(PuppyRepositoryImpl().fetchPuppies(), null)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp(PuppyRepositoryImpl().fetchPuppies(), null)
    }
}


