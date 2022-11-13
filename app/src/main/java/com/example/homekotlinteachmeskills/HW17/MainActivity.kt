package com.example.homekotlinteachmeskills.HW17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.homekotlinteachmeskills.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToHmWrk17_2 = findViewById<Button>(R.id.goToHmWrk17_2)

    }

    fun implicitCall(view: View): Unit {
        val intent: Intent = Intent("testactivity")
        startActivity(intent)
    }

}