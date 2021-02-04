package com.example.rolldice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonroll.setOnClickListener {
            val randomInt = (1..6).random()
            textroll.text = randomInt.toString()
            when (randomInt) {
                1 -> imgdice.setImageResource(R.drawable.dice_1)
                2 -> imgdice.setImageResource(R.drawable.dice_2)
                3 -> imgdice.setImageResource(R.drawable.dice_3)
                4 -> imgdice.setImageResource(R.drawable.dice_4)
                5 -> imgdice.setImageResource(R.drawable.dice_5)
                else -> imgdice.setImageResource(R.drawable.dice_6)
            }
        }
        intentbutton.setOnClickListener {
            val info : Intent = Intent(this, MainActivity2::class.java)
            startActivity(info)
        }
    }


}