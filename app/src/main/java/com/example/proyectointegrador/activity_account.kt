package com.example.proyectointegrador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class AccountActivity : AppCompatActivity() {

    private lateinit var optionsListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        optionsListView = findViewById(R.id.account_options)
        val options = arrayOf("Datos personales", "Configuración de contraseñas", "Notificaciones", "Accesibilidad", "Dispositivos Conectados", "Cuentas Vinculadas", "Centro de Ayuda")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)
        optionsListView.adapter = adapter


    }
}
