package com.example.appjam

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.AttributeSet
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.widget.TextView
import com.example.appjam.databinding.ActivityKeyWordBinding
import com.google.android.material.animation.AnimationUtils

class KeyWordActivity : AppCompatActivity() {

    val binding by lazy { ActivityKeyWordBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}