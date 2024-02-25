package com.example.tms_anonl_17_lesson_161

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        val button = findViewById<Button>(R.id.fifthButton)
        button.setOnClickListener { startFifthActivity() }
        //setOnClickListener- устанавливает мои нажатия
    }

    fun startFifthActivity() {
        val intent = Intent(this, Activity5::class.java)
        startActivity(intent)
    }
}