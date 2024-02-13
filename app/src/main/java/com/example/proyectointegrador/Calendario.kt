package com.example.proyectointegrador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import com.example.proyectointegrador.databinding.ActivityCalendarioBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class Calendario : AppCompatActivity() {
    private lateinit var binding: ActivityCalendarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendario)
        binding = ActivityCalendarioBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Navegation)
        bottomNavigationView.selectedItemId = R.id.calendar
        binding.calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->

                val Date = (dayOfMonth.toString() + "-"
                        + (month + 1) + "-" + year)

                // set this date in TextView for Display
                binding.idTVDate.setText(Date)
            }
        binding.Navegation.setOnItemSelectedListener { item ->
            when (item.getItemId()) {
                R.id.calendar -> {
                    return@setOnItemSelectedListener true
                }
                R.id.Tuto -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            MainActivity::class.java
                        )
                    )

                    finish()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }


    }
}