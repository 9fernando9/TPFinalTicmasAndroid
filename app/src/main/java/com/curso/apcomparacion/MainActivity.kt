package com.curso.apcomparacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.curso.apcomparacion.databinding.ActivityMainBinding
import androidx.activity.viewModels
import viewModel.resultCompararViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val _viewmodel : resultCompararViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        _viewmodel.comparar.observe(this, {
            binding.idresultado.text = it.igual
        })

        binding.btncomparar.setOnClickListener{
            _viewmodel.compararCadenas(binding.idtexto1.text.toString(),binding.idtexto2.text.toString())
        }
    }
}