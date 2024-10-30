package com.example.pirveli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewGreeting: TextView = findViewById(R.id.textViewGreeting)
        val editTextName: EditText = findViewById(R.id.editTextName)
        val buttonOkay: Button = findViewById(R.id.buttonOkay)
        val buttonNext: Button = findViewById(R.id.buttonNext)

        buttonOkay.setOnClickListener {
            val name = editTextName.text.toString()
            textViewGreeting.text = "Hello, $name"
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
