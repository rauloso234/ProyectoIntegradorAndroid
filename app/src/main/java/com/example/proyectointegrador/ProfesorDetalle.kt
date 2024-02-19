package com.example.proyectointegrador


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectointegrador.R
import com.example.proyectointegrador.databinding.ActivityProfesorDetalleBinding

class ProfesorDetalle(val profesor: Profesor) : AppCompatActivity() {

    lateinit var binding: ActivityProfesorDetalleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfesorDetalleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvNombreProfesor.text = profesor.nombre + " " + profesor.apellido1
        binding.tvEmail.text = profesor.email


    }
}