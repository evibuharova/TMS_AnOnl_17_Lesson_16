package com.example.tms_anonl_17_lesson_161

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val button = findViewById<Button>(R.id.forthButton)
        button.setOnClickListener { startForthActivity() }
        //setOnClickListener- устанавливает мои нажатия
    }

    fun startForthActivity() {
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }
}