package com.example.androiddevchallenge

import com.example.androiddevchallenge.listing.PuppyRepository
import com.example.androiddevchallenge.listing.PuppyRepositoryImpl
import com.example.androiddevchallenge.model.Puppy

interface MainPresenter {
    fun getPuppies(): List<Puppy>
}

class MainPresenterImpl: MainPresenter {

    private val repository: PuppyRepository = PuppyRepositoryImpl()

    override fun getPuppies(): List<Puppy> =
        repository.fetchPuppies()
}