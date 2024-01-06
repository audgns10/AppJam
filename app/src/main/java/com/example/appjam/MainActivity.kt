package com.example.appjam

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }

        binding.nextbutton.setOnClickListener {
            var nextPage = Intent(this, KeyWordActivity::class.java)
            startActivity(nextPage)
            overridePendingTransition(R.anim.endtostart, R.anim.starttoend)
        }
    }
}