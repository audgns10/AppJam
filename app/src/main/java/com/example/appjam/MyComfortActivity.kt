package com.example.appjam

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MyComfortActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_comfort)

        val whaleImageView: ImageView = findViewById(R.id.whale)
        whaleImageView.setOnClickListener {
            val intent = Intent(this, MyComfort2Activity::class.java)
            startActivity(intent)
        }
    }
}