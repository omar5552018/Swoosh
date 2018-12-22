package com.example.omaralsaedi.swoosh

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

//        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.beginnerballerbg)
//        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
//        rounded.cornerRadius = 200f
//        check.setImageDrawable(rounded)
    }
}
