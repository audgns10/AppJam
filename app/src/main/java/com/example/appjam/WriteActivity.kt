package com.example.appjam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appjam.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity() {

    val binding by lazy { ActivityWriteBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cancelbtn.setOnClickListener{
            val backPage = Intent(this, KeyWordActivity::class.java)
            startActivity(backPage)
        }

        binding.checkbtn.setOnClickListener{
            val check = Intent(this, MainActivity::class.java)
            startActivity()
        }
    }
}