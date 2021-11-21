package com.example.myanima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class activity_page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)

        val click = findViewById<ImageView>(R.id.next)

        click.setOnClickListener {
            startActivity(Intent(this, activity_page3::class.java))
        }
    }
}