package com.example.environment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var textshow: TextView
    lateinit var showbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //finding view by id for change view on click
        textshow = findViewById(R.id.text1)
        showbtn = findViewById(R.id.showbtn)

        //set onclick listener on show btn
        showbtn.setOnClickListener(){
            //making a toast sms for short time show button clicked
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            //setting textView tex as bellow
            textshow.setText("HI! How are you today")
        }
    }
}