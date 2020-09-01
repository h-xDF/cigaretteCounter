package ru.raralux.cigarettecounter.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ru.raralux.cigarettecounter.R

class MainActivity : AppCompatActivity() {
    private lateinit var smokeBreaksActivityBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        smokeBreaksActivityBtn = findViewById(R.id.cigarettesListBtn)
        smokeBreaksActivityBtn.setOnClickListener {
            intent = Intent(this, SmokeBreaksActivity::class.java)
            startActivity(intent)
        }
    }
}