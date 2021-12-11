package com.example.mydoctor.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydoctor.SignInActivity
import com.example.mydoctor.databinding.ActivityGetStartedBinding

class GetStartedActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            Intent(context, GetStartedActivity::class.java).apply {
                context.startActivity(this)
            }
        }
    }

    private lateinit var binding: ActivityGetStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStartedBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initAction()
    }

    private fun initAction() {
        binding.apply {
            btnGetStarted.setOnClickListener {

            }
            btnSignIn.setOnClickListener {
                SignInActivity.start(this@GetStartedActivity)
            }
        }
    }
}