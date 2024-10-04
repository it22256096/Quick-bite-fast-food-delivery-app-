package com.example.quick_bite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginActbutton = findViewById<Button>(R.id.button7)
        loginActbutton.setOnClickListener {
            val Intent = Intent(this, MenuF::class.java)
            startActivity(Intent)
        }

        val Signup1Actbutton = findViewById<Button>(R.id.button8)
        Signup1Actbutton.setOnClickListener {
            val Intent = Intent(this, Signup::class.java)
            startActivity(Intent)
        }



        }

}