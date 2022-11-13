package com.example.homekotlinteachmeskills.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.homekotlinteachmeskills.R

class Homework17_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework173)

        val goToHmWrk17_4 = findViewById<Button>(R.id.goToHmWrk17_4)


        goToHmWrk17_4.setOnClickListener{
            startActivity(
                Intent(this, Homework17_4::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            )
        }

    }

        override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

}