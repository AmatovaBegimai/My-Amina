package com.example.myanima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class activity_page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        val click = findViewById<ImageView>(R.id.start)

        click.setOnClickListener {
            startActivity(Intent(this, activity_page4::class.java))
        }
    }
}