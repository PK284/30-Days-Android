package com.example.ffa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        val git =findViewById<ImageView>(R.id.imageView8)
        val gmail =findViewById<ImageView>(R.id.imageView7)
        val insta =findViewById<ImageView>(R.id.imageView4)
        val fb = findViewById<ImageView>(R.id.imageView3)

        git.setOnClickListener {
            Toast.makeText(applicationContext,"Welcome to git hub",Toast.LENGTH_SHORT).show()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://github.com/PK284")
            startActivity(intent)
        }

        insta.setOnClickListener {
            Toast.makeText(applicationContext,"Welcome to insta",Toast.LENGTH_SHORT).show()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.instagram.com/")
            startActivity(intent)
        }

        fb.setOnClickListener {
            Toast.makeText(applicationContext,"Welcome to FB",Toast.LENGTH_SHORT).show()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.facebook.com/")
            startActivity(intent)
        }

        gmail.setOnClickListener {
            Toast.makeText(applicationContext,"Welcome to Gmail",Toast.LENGTH_SHORT).show()
            val intent = packageManager.getLaunchIntentForPackage("com.google.android.gm")
            startActivity(intent)
        }
    }
}