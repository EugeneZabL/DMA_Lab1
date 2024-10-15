package com.example.dma_lab1

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val textViewModel: TextViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val myTextView: TextView = findViewById(R.id.text1);
        val changeTextButton: Button = findViewById(R.id.button2);
        var counter = 0;

        textViewModel.text.observe(this) { newText ->
            myTextView.text = newText;
        }

        changeTextButton.setOnClickListener {
            counter++;

            textViewModel.changeText(counter.toString());
        }
}}