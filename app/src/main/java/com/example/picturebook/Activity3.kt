package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        var btnMove=findViewById<Button>(R.id.btnNext)
        var btnForward=findViewById<Button>(R.id.btnForward)
        btnForward.setOnClickListener {
            var intent= Intent(baseContext,Activity4::class.java)
            startActivity(intent)
    }
}
}