package com.example.androiddevchallenge.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private var puppyId: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        puppyId = intent.extras?.getInt(PUPPY_ID_KEY)
    }

    companion object {
        const val PUPPY_ID_KEY = "puppyId"
    }
}