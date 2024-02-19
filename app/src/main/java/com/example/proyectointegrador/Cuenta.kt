package com.example.proyectointegrador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.proyectointegrador.databinding.ActivityCuentaBinding
import com.example.proyectointegrador.databinding.ActivityMainBinding

class Cuenta : AppCompatActivity() {

    private lateinit var optionsListView: ListView
    private lateinit var binding: ActivityCuentaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCuentaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        optionsListView = findViewById(R.id.account_options)
        val options = arrayOf("Datos personales", "Configuración de contraseñas", "Notificaciones", "Accesibilidad", "Dispositivos Conectados", "Cuentas Vinculadas", "Centro de Ayuda")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)
        optionsListView.adapter = adapter

        binding.Navegation.selectedItemId = R.id.Cuenta

        binding.Navegation.setOnItemSelectedListener { item ->
            when (item.getItemId()) {
                R.id.Tuto -> {
                    startActivity(
                        Intent(
                            this,
                            TutoriasRecycler::class.java
                        )
                    )

                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.calendar -> {
                    startActivity(
                        Intent(
                            this,
                            Calendario::class.java
                        )
                    )

                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.Notificaciones -> {
                    startActivity(Intent(this, Notificaciones::class.java))
                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.Profesores -> {
                    startActivity(Intent(this, Profesores::class.java))
                    finish()
                    return@setOnItemSelectedListener true
                }

            }
            false
        }

    }
}