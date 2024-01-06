package com.example.appjam

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class WorryActivity : AppCompatActivity() {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worry)

        val imageView: ImageView = findViewById(R.id.profile)
        imageView.setImageResource(R.drawable.baseline_person_24)

        val menuBar: ImageView = findViewById(R.id.menuBar)
    }
}