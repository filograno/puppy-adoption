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
package com.example.androiddevchallenge.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.listing.PuppyRepositoryImpl
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun Detail(puppy: Puppy) {
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                Image(
                    painter = painterResource(id = puppy.image),
                    contentDescription = null,
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                DetailInfo(puppy = puppy)
            }
        }
    }
}

@Composable
fun DetailInfo(puppy: Puppy) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = puppy.name, style = typography.h6)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = puppy.breed, style = typography.body1)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "📍 ${puppy.address}", style = typography.body2, color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = puppy.description, style = typography.body1)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { }) {
            Text(text = "Adopt me!")
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        Detail(PuppyRepositoryImpl().fetchPuppy(1))
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        Detail(PuppyRepositoryImpl().fetchPuppy(1))
    }
}
