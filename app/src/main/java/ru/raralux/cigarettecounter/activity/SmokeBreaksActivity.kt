package ru.raralux.cigarettecounter.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.raralux.cigarettecounter.R

class SmokeBreaksActivity : AppCompatActivity() {
    private lateinit var addSmokeBreaksBtn: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smoke_breaks)

        addSmokeBreaksBtn = findViewById(R.id.addedBreaksFAB)

        addSmokeBreaksBtn.setOnClickListener{
            Toast.makeText(this, "Click ADD!", Toast.LENGTH_LONG).show()
        }
    }
}