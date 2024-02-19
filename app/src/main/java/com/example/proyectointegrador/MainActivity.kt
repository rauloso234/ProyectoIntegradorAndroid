package com.example.proyectointegrador


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.adapter.tutoriasAdapter
import com.example.proyectointegrador.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        initRecyclerView()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Navegation)
        bottomNavigationView.selectedItemId = R.id.Tuto

        binding.BtnAdd.setOnClickListener {
            startActivity(Intent(this, formularioTutorias::class.java))
        }

        binding.Navegation.setOnItemSelectedListener { item ->
            when (item.getItemId()) {
                R.id.Tuto -> {
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
    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.tutorias)
        val tutoriasList: MutableList<Tutorias> = TutoriasLista.tutoriasList.toMutableList()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = tutoriasAdapter(tutoriasList)
    }
}