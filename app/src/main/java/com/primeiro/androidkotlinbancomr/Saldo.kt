package com.primeiro.androidkotlinbancomr

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.primeiro.androidkotlinbancomr.databinding.ActivityMainBinding
import com.primeiro.androidkotlinbancomr.databinding.ActivitySaldoBinding

class Saldo : AppCompatActivity() {

    private lateinit var binding : ActivitySaldoBinding

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarsaldo
        this.title = "Saldo Disponivel"
        toolbar.run {
            title = "Saldo Disponivel"
            setTitleTextColor(getColor(R.color.white))
            toolbar.setTitleMargin(400,0,0,400)
            toolbar.setBackgroundColor(getColor(R.color.black))
            toolbar.setNavigationIcon(getDrawable(R.drawable.voltar))
            toolbar.setNavigationOnClickListener {
                val intent = Intent(this@Saldo,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}