package com.example.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linearlayout2)

        val edtTxt=findViewById<EditText>(R.id.editText1)
        val submitBtn=findViewById<Button>(R.id.btn1)
    }
}