package com.example.demo

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import com.example.demo.R.id.startButton
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class startScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        val btn=findViewById<Button>(R.id.startButton)

        btn.setOnClickListener {
            val intent=Intent(this@startScreen,TopicList::class.java)
            startActivity(intent)
        }

    }
}