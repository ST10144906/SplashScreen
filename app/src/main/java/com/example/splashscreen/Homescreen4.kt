package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homescreen4 : AppCompatActivity() {
    private lateinit var pizzaButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen4)

        pizzaButton.setOnClickListener{
            var intent2 = Intent( this, MainActivity::class.java)
    }
}}