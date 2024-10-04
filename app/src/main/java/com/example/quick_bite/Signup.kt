package com.example.quick_bite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val ConfirmActbutton = findViewById<Button>(R.id.button9)
        ConfirmActbutton.setOnClickListener {
            val Intent = Intent(this, MenuF::class.java)
            startActivity(Intent)
        }

        val CancelActbutton = findViewById<Button>(R.id.button10)
        CancelActbutton.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }


    }
}