package com.example.appjam

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.example.appjam.databinding.ActivityKeyWordBinding
import com.google.android.material.animation.AnimationUtils

class KeyWordActivity : AppCompatActivity() {

    val binding by lazy { ActivityKeyWordBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val editText = binding.editwords
        val nextPageBtn = binding.nextpagebtn

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                nextPageBtn.isEnabled = !charSequence.isNullOrEmpty()
            }

            override fun afterTextChanged(editable: Editable?) {}
        })
        binding.nextpagebtn.setOnClickListener{
            val movewirte = Intent(this, WriteActivity::class.java)
            startActivity(movewirte)
        }
    }
}