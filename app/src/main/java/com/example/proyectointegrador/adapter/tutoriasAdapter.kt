package com.example.proyectointegrador.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.R
import com.example.proyectointegrador.Tutorias

class tutoriasAdapter(private val tutorlista: List<Tutorias>) : RecyclerView.Adapter<tutoriasViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tutoriasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return tutoriasViewHolder(layoutInflater.inflate(R.layout.item_tutoria, parent, false))
    }

    override fun getItemCount(): Int = tutorlista.size



    override fun onBindViewHolder(holder: tutoriasViewHolder, position: Int) {
        val item = tutorlista[position]
        holder.render(item)
    }
}