package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeScreen2 : AppCompatActivity() {
    private lateinit var pizzaButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen2)

        pizzaButton.setOnClickListener{
            var intent2 = Intent( this, MainActivity::class.java)
    }
}
}