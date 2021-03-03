package com.example.androiddevchallenge.detail

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevchallenge.listing.MyApp
import com.example.androiddevchallenge.listing.PuppyRepository
import com.example.androiddevchallenge.listing.PuppyRepositoryImpl
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {

    private var puppyId: Int? = null
    private val repository: PuppyRepository = PuppyRepositoryImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        puppyId = intent.extras?.getInt(PUPPY_ID_KEY)
        val puppy = repository.fetchPuppy(puppyId!!)
        setContent {
            MyTheme {
                Detail(puppy)
            }
        }
    }

    companion object {
        const val PUPPY_ID_KEY = "puppyId"
    }
}