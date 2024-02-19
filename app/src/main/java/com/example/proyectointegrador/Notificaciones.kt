package com.example.proyectointegrador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectointegrador.R
import com.example.proyectointegrador.adapter.NotificacionesAdapter
import com.example.proyectointegrador.databinding.ActivityNotificacionesBinding

class Notificaciones : AppCompatActivity() {

    private lateinit var binding: ActivityNotificacionesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificacionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Navegation.selectedItemId = R.id.Notificaciones
       initRecyclerView()


        binding.Navegation.setOnItemSelectedListener { item ->
            when (item.getItemId()) {
                R.id.Tuto -> {
                    startActivity(
                        Intent(
                            this,
                            TutoriasRecycler::class.java
                        )
                    )
                    finish()
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
        binding.rvNotificaciones.layoutManager = LinearLayoutManager(this)
        binding.rvNotificaciones.adapter = NotificacionesAdapter(NotificacionesTestData.notificaciones)
    }
}