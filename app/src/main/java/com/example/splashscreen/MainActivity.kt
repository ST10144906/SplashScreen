package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    private lateinit var pizzaButton1: Button
    private lateinit var pizzaButton2: Button
    private lateinit var pizzaButton3: Button
    private lateinit var pizzaButton4: Button
    private lateinit var pizzaButton5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val intent = Intent ( this, HomeScreen::class.java)
            startActivity(intent)
            finish()
        }, 3000)

        pizzaButton1 = findViewById(R.id.button3)
        pizzaButton1.setOnClickListener{
            var intent2 = Intent( this, HomeScreen::class.java)
        }

        pizzaButton2 = findViewById(R.id.button4)
        pizzaButton2.setOnClickListener{
            var intent3 = Intent( this, HomeScreen2::class.java)
        }

        pizzaButton3 = findViewById(R.id.button5)
        pizzaButton3.setOnClickListener{
            var intent4 = Intent( this, HomeScreen3::class.java)
        }

        pizzaButton4 = findViewById(R.id.button6)
        pizzaButton4.setOnClickListener{
            var intent5 = Intent( this, Homescreen4::class.java)
        }

        pizzaButton5 = findViewById(R.id.button7)
        pizzaButton5.setOnClickListener{
            var intent6 = Intent( this, Homescreen5::class.java)
        }
    }
}