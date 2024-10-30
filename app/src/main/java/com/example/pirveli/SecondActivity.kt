package com.example.pirveli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewCounter: TextView = findViewById(R.id.textViewCounter)
        val buttonClick: Button = findViewById(R.id.buttonClick)

        buttonClick.setOnClickListener {
            counter++
            textViewCounter.text = counter.toString()
        }
    }
}
