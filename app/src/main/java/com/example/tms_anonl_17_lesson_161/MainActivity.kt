package com.example.tms_anonl_17_lesson_161

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.secondButton)
        button.setOnClickListener { startSecondActivity() }
        //setOnClickListener- устанавливает мои нажатия
    }

    fun startSecondActivity() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }
}