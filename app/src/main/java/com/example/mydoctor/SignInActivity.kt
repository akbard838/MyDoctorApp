package com.example.mydoctor

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydoctor.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            Intent(context, SignInActivity::class.java).apply {
                context.startActivity(this)
            }
        }
    }

    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            btnSignIn.setOnClickListener {

            }
            tvCreateAccount.setOnClickListener {
                SignUpActivity.start(this@SignInActivity)
            }
            tvForgotPassword.setOnClickListener {

            }
        }
    }
}