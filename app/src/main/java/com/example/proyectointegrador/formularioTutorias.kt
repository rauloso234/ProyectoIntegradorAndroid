package com.example.proyectointegrador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectointegrador.adapter.tutoriasAdapter
import com.example.proyectointegrador.databinding.ActivityFormularioTutoriasBinding
import java.time.LocalDateTime


class formularioTutorias : AppCompatActivity() {
    private lateinit var binding: ActivityFormularioTutoriasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFormularioTutoriasBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)

        binding.btnCrear.setOnClickListener {
            // Obtén los valores de los campos del formulario
            val nomProf = "Ivan Alexis" //esto se recogera de el usuario si es profesor, si es alumno el campo alumno sera el que se auto rellene y el de profesor el que haya q rellenarse
            val tutoTitle = binding.edtTituloTuto.text.toString()
            val aula = binding.edtAula.text.toString()
            val PersonaCitada = binding.edtNombreAlum.toString()
            val Edificio = binding.edtEdif.toString()
            //val fecha = binding.editTextDate

            // Crea una nueva instancia de Tutorias con los valores del formulario
            val nuevaTutoria = Tutorias(nomProf, tutoTitle, PersonaCitada, aula, Edificio,
                LocalDateTime.parse("2023-02-12T12:30:00"))
            val adapter = intent.getSerializableExtra("RECYCLER_VIEW_ADAPTER") as? tutoriasAdapter
            adapter?.agregarTutoria(nuevaTutoria)

            // Agrega la nueva tutoría a la lista tutoriasList en TutoriasLista
            TutoriasLista.tutoriasList.plus(nuevaTutoria)

            // Actualiza la lista en el adaptador y notifica los cambios
            adapter?.actualizarLista(TutoriasLista.tutoriasList)
            finish()
        }
    }



}