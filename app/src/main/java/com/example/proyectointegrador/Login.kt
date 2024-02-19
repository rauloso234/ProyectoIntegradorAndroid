package com.example.proyectointegrador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Referencias a los EditText y el botón
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.loginButton)

        // Listener para el botón de acceder
        loginButton.setOnClickListener {
            // Verificar si el correo y la contraseña son correctos
            if (emailInput.text.toString() == "guillermo.callizaya@live.u-tad.com" && passwordInput.text.toString() == "holahola") {
                // Si son correctos, navegar a MainActivity
                val intent = Intent(this, Calendario::class.java)
                startActivity(intent)
            } else {
                // Si no son correctos, mostrar un mensaje
                Toast.makeText(this, "Correo o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
