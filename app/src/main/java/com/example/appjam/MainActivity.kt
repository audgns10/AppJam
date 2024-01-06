package com.example.appjam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import com.example.appjam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val etPassword = binding.passwordedittext
        val btnHide = binding.btnPasswordHide

        btnHide.setOnClickListener {
            when (btnHide.tag as String) {
                "0" -> {
                    btnHide.tag = "1"
                    etPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                    btnHide.setImageResource(R.drawable.ic_show)
                }

                "1" -> {
                    btnHide.tag = "0"
                    etPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                    btnHide.setImageResource(R.drawable.ic_show)
                }
            }
            etPassword.setSelection(etPassword.text!!.length)
        }
    }
}