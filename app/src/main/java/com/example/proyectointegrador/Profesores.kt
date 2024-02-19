package com.example.proyectointegrador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectointegrador.adapter.NotificacionesAdapter
import com.example.proyectointegrador.adapter.ProfesoresAdapter
import com.example.proyectointegrador.databinding.ActivityProfesoresBinding

class Profesores : AppCompatActivity() {

    lateinit var binding: ActivityProfesoresBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfesoresBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.Navegation
        initRecyclerView()
        binding.Navegation.selectedItemId = R.id.Profesores
        binding.Navegation.setOnItemSelectedListener { item ->
            when (item.getItemId()) {
                R.id.Tuto -> {
                    return@setOnItemSelectedListener true
                }
                R.id.calendar -> {
                    startActivity(
                        Intent(
                            this,
                            Calendario::class.java
                        )
                    )

                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.Notificaciones -> {
                    startActivity(Intent(this, Notificaciones::class.java))
                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.Profesores -> {
                    startActivity(Intent(this, Profesores::class.java))
                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.Cuenta -> {
                    startActivity(Intent(this, Cuenta::class.java))
                    finish()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }

    }

    fun initRecyclerView(){
        binding.rvProfesores.layoutManager = LinearLayoutManager(this)
        binding.rvProfesores.adapter = ProfesoresAdapter(ProfesoresTestData.profesores)
    }
}