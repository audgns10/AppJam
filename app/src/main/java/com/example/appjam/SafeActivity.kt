package com.example.appjam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SafeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_safe)

        val whaleImageView: ImageView = findViewById(R.id.whale)
        whaleImageView.setOnClickListener {
            val intent = Intent(this, Safe2Activity::class.java)
            startActivity(intent)
        }
    }
}