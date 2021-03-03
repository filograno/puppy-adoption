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

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.Sex

class PuppyRepositoryImpl : PuppyRepository {

    override fun fetchPuppies(): List<Puppy> =
        listOf(
            Puppy(
                1,
                "Nora",
                R.drawable.nora,
                Sex.FEMALE,
                "Corgi",
                2,
                "110 N 3th St, Brooklyn, NY, USA",
                "The Nora is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet."
            ),
            Puppy(
                2,
                "Noble",
                R.drawable.noble,
                Sex.MALE,
                "Jack Russell terrier",
                3,
                "110 N 3th St, Brooklyn, NY, USA",
                "The Noble is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet."
            ),
            Puppy(
                3,
                "George",
                R.drawable.george,
                Sex.MALE,
                "Beagle",
                5,
                "110 N 3th St, Brooklyn, NY, USA",
                "The George is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet."
            ),
            Puppy(
                4,
                "Matty",
                R.drawable.matty,
                Sex.FEMALE,
                "French Bulldog",
                8,
                "110 N 3th St, Brooklyn, NY, USA",
                "The Matty is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet."
            )
        )

    override fun fetchPuppy(id: Int): Puppy =
        fetchPuppies().first { it.id == id }
}