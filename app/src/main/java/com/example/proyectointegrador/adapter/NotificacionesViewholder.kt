package com.example.proyectointegrador.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.Notificacion
import com.example.proyectointegrador.databinding.ItemNotifcacionBinding


class NotificacionesViewholder(view : View): RecyclerView.ViewHolder(view){

    val binding = ItemNotifcacionBinding.bind(itemView)

    fun render(notificacion: Notificacion){

        binding.tvTituloNotificacion.text = notificacion.titulo
        binding.tvAsuntoNotificacion.text = notificacion.asunto

    }

}