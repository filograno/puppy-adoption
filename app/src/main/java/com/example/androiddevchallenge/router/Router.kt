package com.example.androiddevchallenge.router

import android.content.Context
import android.content.Intent
import com.example.androiddevchallenge.detail.DetailActivity

interface Router {
    fun openDetail(context: Context, puppyId: Int)
}

class RouterImpl: Router {
    override fun openDetail(context: Context, puppyId: Int) {
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.PUPPY_ID_KEY, puppyId)
        context.startActivity(intent)
    }
}