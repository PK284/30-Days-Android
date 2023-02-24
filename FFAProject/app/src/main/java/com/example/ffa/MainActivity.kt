package com.example.ffa

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<CardView>(R.id.view)

        btn.setOnClickListener{
            Toast.makeText(applicationContext, "Ok", Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext,Page2::class.java)
            startActivity(intent)
        }
    }
}