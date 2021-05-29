package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        var btnclick=findViewById<Button>(R.id.btnNext)
        var btnNext=findViewById<Button>(R.id.btnForward)

        btnNext.setOnClickListener {
            var intent=Intent(baseContext,Activity3::class.java)
            startActivity(intent)
        }
    }
}