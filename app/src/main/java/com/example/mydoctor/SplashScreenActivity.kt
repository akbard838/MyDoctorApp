package com.example.mydoctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.mydoctor.databinding.ActivitySplashScreenBinding
import com.example.mydoctor.view.GetStartedActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            GetStartedActivity.start(this)
            finish()
        }, 2000)
    }

}