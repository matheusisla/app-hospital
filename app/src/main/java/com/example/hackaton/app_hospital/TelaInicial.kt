package com.example.hackaton.app_hospital

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TelaInicial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
    }

    fun navegacaoEnfermagem() {
        var intent = Intent(this, TelaListagem::class.java)
        intent.putExtra("tipo", "enfermagem")
        startActivity(intent)
    }

    fun navegacaoLimpeza() {
        var intent = Intent(this, TelaListagem::class.java)
        intent.putExtra("tipo", "limpeza")
        startActivity(intent)
    }
}
