package com.example.intent

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Audio.Media
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)

        btn1.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("http://www.github.com/pk284")
            startActivity(intent)
            Toast.makeText(applicationContext,"Ok",Toast.LENGTH_SHORT).show()
//            val intent = Intent(ACTION_VIEW, Uri.parse("http://www.google.com"))
//            val link = "http://www.github.com/pk284"
//            val intent = Intent(ACTION_VIEW)
//            intent.data = Uri.parse(link)
//            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

    }
}