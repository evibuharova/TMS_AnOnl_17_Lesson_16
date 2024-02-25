package com.example.tms_anonl_17_lesson_161

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val button = findViewById<Button>(R.id.thirdButton)
        button.setOnClickListener { startThirdActivity() }
        //setOnClickListener- устанавливает мои нажатия
    }

    fun startThirdActivity() {
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }
}