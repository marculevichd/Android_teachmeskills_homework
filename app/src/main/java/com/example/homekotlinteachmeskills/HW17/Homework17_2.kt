package com.example.homekotlinteachmeskills.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.homekotlinteachmeskills.R

class Homework17_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework172)


        val goToHmWrk17_3 = findViewById<Button>(R.id.goToHmWrk17_3)


        goToHmWrk17_3.setOnClickListener{
            startActivity(
                Intent(this, Homework17_3::class.java)
            )
        }
    }
}