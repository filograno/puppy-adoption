package com.example.androiddevchallenge.listing

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.Sex

class PuppyRepositoryImpl : PuppyRepository {

    override fun fetchPuppies(): List<Puppy> =
        listOf(
            Puppy(
                "Nora",
                R.drawable.nora,
                Sex.FEMALE,
                "Corgi",
                2,
                "110 N 3th St, Brooklyn, NY, USA",
                "The Nora is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet."
            ),
            Puppy(
                "Noble",
                R.drawable.noble,
                Sex.MALE,
                "Jack Russell terrier",
                3,
                "110 N 3th St, Brooklyn, NY, USA",
                "The Noble is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet."
            ),
            Puppy(
                "George",
                R.drawable.george,
                Sex.MALE,
                "Beagle",
                5,
                "110 N 3th St, Brooklyn, NY, USA",
                "The George is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet."
            ),
            Puppy(
                "Matty",
                R.drawable.matty,
                Sex.FEMALE,
                "French Bulldog",
                8,
                "110 N 3th St, Brooklyn, NY, USA",
                "The Matty is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet."
            )
        )
}