package com.example.mydoctor

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.mydoctor.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    companion object {
        fun start(context: Context) {
            Intent(context, SignUpActivity::class.java).apply {
                context.startActivity(this)
            }
        }
    }

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            setSupportActionBar(this.toolbarSignUp.toolbar)
            supportActionBar?.title = ""
            toolbarSignUp.tvTitleToolbar.text = getString(R.string.title_create_account)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
            }
        }
        return true
    }
}