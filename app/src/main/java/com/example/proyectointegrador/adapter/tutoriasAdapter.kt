package com.example.proyectointegrador.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.R
import com.example.proyectointegrador.Tutorias
import java.io.Serializable


class tutoriasAdapter(private val tutorlista: MutableList<Tutorias>) : RecyclerView.Adapter<tutoriasViewHolder>(),
    Serializable {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tutoriasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return tutoriasViewHolder(layoutInflater.inflate(R.layout.item_tutoria, parent, false))
    }

    override fun getItemCount(): Int = tutorlista.size



    override fun onBindViewHolder(holder: tutoriasViewHolder, position: Int) {
        val item = tutorlista[position]
        holder.render(item)
    }

    fun agregarTutoria(tutoria: Tutorias) {
        tutorlista.add(tutoria)
        notifyItemInserted(tutorlista.size - 1)
    }
    fun actualizarLista(nuevaLista: List<Tutorias>) {
        tutorlista.clear()
        tutorlista.addAll(nuevaLista)
        notifyDataSetChanged()
    }




}