package com.example.proyectointegrador.adapter

import android.view.View
import android.widget.PopupMenu
import com.example.proyectointegrador.R

import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.Tutorias
import com.example.proyectointegrador.databinding.ItemTutoriaBinding
import java.time.format.DateTimeFormatter


class tutoriasViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val binding = ItemTutoriaBinding.bind(itemView)
    fun render(tutoria: Tutorias){
        binding.tvNombreTutoria.text = tutoria.tituloAsunto
        val text = "Aula: " + tutoria.NumAula.toString()
        binding.tvAula.text =text
        binding.tvEdif.text = tutoria.NombreEdif
        binding.tvHora.text = DateTimeFormatter.ofPattern("dd-MM-yy hh:mm").format(tutoria.Hora)
        binding.dotsBtn.setOnClickListener {
            showPopupMenu(it)
        }
    }

    private fun showPopupMenu(view: View) {
        val popupMenu = PopupMenu(view.context, view)
        popupMenu.menuInflater.inflate(R.menu.menu_opciones, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_eliminar -> {
                    // Lógica para la opción eliminar
                    true
                }
                R.id.menu_modificar -> {
                    // Lógica para la opción modificar
                    true
                }
                else -> false
            }
        }

        popupMenu.show()
    }

}