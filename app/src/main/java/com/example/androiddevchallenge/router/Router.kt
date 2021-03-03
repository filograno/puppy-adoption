package com.example.androiddevchallenge.router

import android.content.Context
import android.content.Intent
import com.example.androiddevchallenge.detail.DetailActivity

interface Router {
    fun openDetail(context: Context)
}

class RouterImpl: Router {
    override fun openDetail(context: Context) {
        val intent = Intent(context, DetailActivity::class.java)
        context.startActivity(intent)
    }
}