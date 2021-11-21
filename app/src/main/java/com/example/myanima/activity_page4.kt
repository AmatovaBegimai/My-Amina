package com.example.myanima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        val click = findViewById<Button>(R.id.Home)

        click.setOnClickListener {
            startActivity(Intent(this, activity_page5::class.java))

            val click = findViewById<Button>(R.id.Settings)

            click.setOnClickListener {
                startActivity(Intent(this, activity_page6::class.java))
            }
        }
    }
}