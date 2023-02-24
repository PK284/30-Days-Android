package com.example.ffa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class gmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gmail)
        val wv=findViewById<WebView>(R.id.wv)

        wv.loadUrl("https://www.geeksforgeeks.org")

        // this will enable the javascript.
        wv.settings.javaScriptEnabled = true

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        wv.webViewClient = WebViewClient()
    }
}