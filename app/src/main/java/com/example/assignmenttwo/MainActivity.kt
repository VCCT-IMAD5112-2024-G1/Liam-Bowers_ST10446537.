package com.example.assignmenttwo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var startBtn = findViewById<Button>(R.id.startBtn)
        startBtn.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, MainActivity2::class.java)
            // start the activity
            startActivity(intent)

        }
    }
}