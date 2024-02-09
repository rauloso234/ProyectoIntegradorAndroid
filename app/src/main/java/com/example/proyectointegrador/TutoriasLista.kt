package com.example.proyectointegrador

import java.time.LocalDateTime

class TutoriasLista {
    companion object{
       val tutoriasList = listOf(
           Tutorias("Ivan", "Reunion de Emergencia",
               "Raúl Fernandez","B04","Madrid", LocalDateTime.parse("2023-02-12T12:30:00")
           )
       )
    }
}