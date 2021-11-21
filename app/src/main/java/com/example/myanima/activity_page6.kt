package com.example.myanima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)

        val click = findViewById<Button>(R.id.Home)
        click.setOnClickListener {
            startActivity(Intent(this, activity_page5::class.java))


            val click = findViewById<Button>(R.id.Main)
            click.setOnClickListener {
                startActivity(Intent(this, activity_page4::class.java))
            }
        }
    }
}