package com.example.proyectointegrador

class NotificacionesTestData {

    // Array para pruebas de lista, en su lugar, cargar las notificaciones desde la persistencia
    companion object{
        val notificaciones = listOf<Notificacion>(
            Notificacion("Mensaje de Iván Alexis", "Hola!", ""),
            Notificacion("Recordatorio", "Reunion DAM - 15/03", "")
        )
    }

}