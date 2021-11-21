package com.example.myanima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click = findViewById<ImageView>(R.id.login)


        click.setOnClickListener {
            startActivity(Intent(this, activity_page2::class.java))
        }
    }
}