package com.example.proyectointegrador

import java.util.Date

class TutoriasLista {
    companion object{
       val tutoriasList = listOf<Tutorias>(
           Tutorias("Ivan", "Reunion de Emergencia",
               "Raúl Fernandez",250,"Madrid", Date(2023, 11, 12)
           )
       )
    }
}