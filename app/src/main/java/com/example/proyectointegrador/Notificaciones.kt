package com.example.proyectointegrador

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

       initRecyclerView()


    }

    fun initRecyclerView(){
        binding.rvNotificaciones.layoutManager = LinearLayoutManager(this)
        binding.rvNotificaciones.adapter = NotificacionesAdapter(NotificacionesTestData.notificaciones)
    }
}