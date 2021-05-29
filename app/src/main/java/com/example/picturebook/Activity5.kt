package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)
        var btnClick4=findViewById<Button>(R.id.btnHead)
        var btnBack=findViewById<Button>(R.id.btnback)
        btnBack.setOnClickListener {
            var intent= Intent(baseContext,Activity4::class.java)
            startActivity(intent)
    }
    }
}