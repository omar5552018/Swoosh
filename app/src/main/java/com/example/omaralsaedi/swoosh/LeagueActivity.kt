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

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.old)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        rounded.cornerRadius = 33f
        oldImg.setImageDrawable(rounded)

        val bitmap1 = BitmapFactory.decodeResource(resources, R.drawable.man)
        val rounded1 = RoundedBitmapDrawableFactory.create(resources, bitmap1)
        rounded1.cornerRadius = 33f
        menImg.setImageDrawable(rounded1)


        val bitmap2 = BitmapFactory.decodeResource(resources, R.drawable.girls)
        val rounded2 = RoundedBitmapDrawableFactory.create(resources, bitmap2)
        rounded2.cornerRadius = 33f
        girlsImg.setImageDrawable(rounded2)


        val bitmap3 = BitmapFactory.decodeResource(resources, R.drawable.kids)
        val rounded3 = RoundedBitmapDrawableFactory.create(resources, bitmap3)
        rounded3.cornerRadius = 33f
        kidImg.setImageDrawable(rounded3)



    }
}
