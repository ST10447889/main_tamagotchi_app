package com.st10447889.tamagotchi_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.button)
        next.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }




    }
}
