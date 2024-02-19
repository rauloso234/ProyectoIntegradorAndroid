package com.example.proyectointegrador.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.Profesor
import com.example.proyectointegrador.databinding.ItemProfesorBinding

class ProfesoresViewHolder (view : View): RecyclerView.ViewHolder(view) {

    val binding = ItemProfesorBinding.bind(itemView)

    fun render(profesor: Profesor){

        binding.tvNombreProfesor.text = profesor.nombre
        binding.tvApellidos.text = profesor.apellido1
        binding.tvEmail.text = profesor.email
        binding.tvDepartamento.text = profesor.departamento

    }

}