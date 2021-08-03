package com.oracle.loginapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.home_page.*

class WelcomeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
        val intent = intent
        val receivedEmail = intent.getStringExtra("emailAddress")
        textViewMessage.text="Welcome "+receivedEmail
    }
}