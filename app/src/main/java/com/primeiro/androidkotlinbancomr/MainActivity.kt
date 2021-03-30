package com.primeiro.androidkotlinbancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.primeiro.androidkotlinbancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idSaldo.setOnClickListener{
            val intent = Intent(this, Saldo:: class.java)
            startActivity(intent)
        }


    }
}