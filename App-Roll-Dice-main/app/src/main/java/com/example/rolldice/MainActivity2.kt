package com.example.rolldice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        buttonReturn.setOnClickListener {
            val quaylai : Intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(quaylai)
        }
    }
}