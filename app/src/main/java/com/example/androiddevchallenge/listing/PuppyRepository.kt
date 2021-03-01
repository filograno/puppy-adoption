package com.example.androiddevchallenge.listing

import com.example.androiddevchallenge.model.Puppy

interface PuppyRepository {
    fun fetchPuppies(): List<Puppy>
}