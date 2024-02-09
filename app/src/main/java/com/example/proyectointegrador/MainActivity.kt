package com.example.proyectointegrador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectointegrador.adapter.tutoriasAdapter
import com.example.proyectointegrador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        initRecyclerView()

    }
    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.tutorias)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = tutoriasAdapter(TutoriasLista.tutoriasList)
    }
}