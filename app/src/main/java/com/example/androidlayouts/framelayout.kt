package com.example.androidlayouts

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class framelayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var textView: TextView
        var editText1: EditText
        var editText2: EditText
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_framelayout)

        textView = findViewById(R.id.txtvw1);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
    }
}