package com.example.point_count

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etPlayer1:EditText = findViewById(R.id.etPlayer1);
        val etPlayer2:EditText = findViewById(R.id.etPlayer2);
        val addPlayer1:Button = findViewById(R.id.btnAddPlayer1);
        val subPlayer1:Button = findViewById(R.id.btnSubPlayer1);
        val addPlayer2:Button = findViewById(R.id.btnAddPlayer2);
        val subPlayer2:Button = findViewById(R.id.btnSubPlayer2);
        val reset:Button = findViewById(R.id.button6);

        reset.setOnClickListener {
            etPlayer1.setText("0")
            etPlayer2.setText("0")
        }

        addPlayer1.setOnClickListener {
            val current = etPlayer1.text.toString().toIntOrNull() ?: 0
            val updated = current + 1
            etPlayer1.setText(updated.toString())
        }

        subPlayer1.setOnClickListener {
            val current = etPlayer1.text.toString().toIntOrNull() ?: 0
            val updated = current - 1
            etPlayer1.setText(updated.toString())
        }

        addPlayer2.setOnClickListener {
            val current = etPlayer2.text.toString().toIntOrNull() ?: 0
            val updated = current + 1
            etPlayer2.setText(updated.toString())
        }

        subPlayer2.setOnClickListener {
            val current = etPlayer2.text.toString().toIntOrNull() ?: 0
            val updated = current - 1
            etPlayer2.setText(updated.toString())
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}