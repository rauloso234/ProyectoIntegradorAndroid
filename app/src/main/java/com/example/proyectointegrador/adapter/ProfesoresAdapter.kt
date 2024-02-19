package com.example.proyectointegrador.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.Profesor
import com.example.proyectointegrador.R

class ProfesoresAdapter (private val profesores: List<Profesor>): RecyclerView.Adapter<ProfesoresViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfesoresViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProfesoresViewHolder(layoutInflater.inflate(R.layout.item_profesor, parent, false))
    }

    override fun getItemCount(): Int {
        return profesores.size
    }

    override fun onBindViewHolder(holder: ProfesoresViewHolder, position: Int) {

        val item = profesores[position]
        holder.render(item)

    }

}