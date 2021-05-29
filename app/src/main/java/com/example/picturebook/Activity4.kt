package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        var btnForward=findViewById<Button>(R.id.btnForward)
        var btnHead=findViewById<Button>(R.id.btnHead)
        btnHead.setOnClickListener {
            var intent= Intent(baseContext,Activity5::class.java)
            startActivity(intent)
    }
    }
}