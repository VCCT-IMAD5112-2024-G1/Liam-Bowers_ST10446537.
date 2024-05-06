package com.example.assignmenttwo

import android.content.IntentSender.OnFinished
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val jackImg = findViewById<ImageView>(R.id.jackImg)

        val happyBtn = findViewById<Button>(R.id.happyBtn)
        val happyText = findViewById<TextView>(R.id.happyLvl)
        val dirtyBtn =findViewById<Button>(R.id.dirtyBtn)
        val dirtyText = findViewById<TextView>(R.id.dirtyLvl)
        val feedBtn = findViewById<Button>(R.id.feedBtn)
        val feedText = findViewById<TextView>(R.id.feedLvl)

        // Happy dog
        val happyTimer = object : CountDownTimer(30000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                happyText.setText(" " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                jackImg.setImageResource(R.drawable.openingdog)
                happyText.setText("Love Jack!")
            }
        }

        happyBtn.setOnClickListener {
            happyTimer.cancel()
            happyText.setText("Happy!")
            jackImg.setImageResource(R.drawable.happy_dog)
            happyTimer.start()
        }

        // Dirty dog
        val dirtyTimer = object : CountDownTimer(100000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                dirtyText.setText(" " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                jackImg.setImageResource(R.drawable.dirty_dog)
            }
        }

        dirtyBtn.setOnClickListener {
            dirtyTimer.cancel()
            dirtyText.setText("Clean!")
            jackImg.setImageResource(R.drawable.openingdog)
            dirtyTimer.start()
        }

        // Feed dog
        val feedTimer = object : CountDownTimer(45000,1000) {

            override fun onTick(millisUntilFinished: Long) {
                feedText.setText(" " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                jackImg.setImageResource(R.drawable.hungry_dog)
            }
        }

        feedBtn.setOnClickListener {
            feedTimer.cancel()
            feedText.setText("Fed!")
            jackImg.setImageResource(R.drawable.openingdog)
            feedTimer.start()
        }

        // Start timers
        dirtyTimer.start()
        happyTimer.start()
        feedTimer.start()
    }
}




