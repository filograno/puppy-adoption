package com.example.androiddevchallenge.model

data class Puppy(
    val name: String,
    val image: Int,
    val sex: Sex,
    val breed: String,
    val weight: Int,
    val address: String,
    val description: String
)

enum class Sex {
    MALE,
    FEMALE
}