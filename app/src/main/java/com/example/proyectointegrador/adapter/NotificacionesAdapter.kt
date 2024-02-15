package com.example.proyectointegrador.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.Notificacion
import com.example.proyectointegrador.R

class NotificacionesAdapter(private val notificaciones: List<Notificacion>): RecyclerView.Adapter<NotificacionesViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificacionesViewholder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NotificacionesViewholder(layoutInflater.inflate(R.layout.item_notifcacion, parent, false))
    }

    override fun getItemCount(): Int {
        return notificaciones.size
    }

    override fun onBindViewHolder(holder: NotificacionesViewholder, position: Int) {

        val item = notificaciones[position]
        holder.render(item)

    }
}