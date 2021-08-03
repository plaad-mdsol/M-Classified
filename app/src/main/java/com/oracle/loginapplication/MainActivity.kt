package com.oracle.loginapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.prop_layout.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSubmit.setOnClickListener {
            if(editTextEmail.text.toString().isNullOrEmpty() || editTextPassword.text.toString().isNullOrEmpty())
                Toast.makeText(this, "Email Address or Password is not provided",  Toast.LENGTH_LONG).show()
            else {
                if (editTextEmail.text.toString() == "pld3@3ds.com" && editTextPassword.text.toString() == "admin") {
                    val intent = Intent(this, MainActivityHome::class.java)
//                    intent.putExtra("emailAddress", editTextEmail1.text.toString());
                    startActivity(intent)
                } else {
                    val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    inputMethodManager.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
                    val toast = Toast.makeText(this,"Email Address or Password is Incorrect. Try again",Toast.LENGTH_LONG)
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 250)
                    toast.show()
                }
            }
        }
    }
}