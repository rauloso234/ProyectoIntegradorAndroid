package com.example.proyectointegrador.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.Tutorias
import com.example.proyectointegrador.databinding.ItemTutoriaBinding

class tutoriasViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val binding = ItemTutoriaBinding.bind(itemView)
    fun render(tutoria: Tutorias){
        binding.tvNombreTutoria.text = tutoria.tituloTutoria
        binding.tvAula.text = tutoria.NumAula.toString()
        binding.tvEdif.text = tutoria.NombreEdif
        binding.tvHora.text = tutoria.Hora.toString()
    }
}