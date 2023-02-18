package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnUp = findViewById<Button>(R.id.upload)
        val btnDn = findViewById<Button>(R.id.Download)

        btnUp.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading",Toast.LENGTH_LONG).show()
        }

        btnDn.setOnClickListener {
            Toast.makeText(applicationContext,"Downloading",Toast.LENGTH_SHORT).show()
        }
    }
}