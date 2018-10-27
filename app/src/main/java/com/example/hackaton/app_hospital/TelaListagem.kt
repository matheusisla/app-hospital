package com.example.hackaton.app_hospital

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.security.Key
import java.util.*

class TelaListagem : AppCompatActivity() {
    private var tipo: String = ""
    private var itens: Array<Quartos> = emptyArray()
    private var status: List<String> = listOf("Aguardando Limpeza", "Aguardando Aprovação", "Em Limpeza", "Liberado")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_listagem2)
        if (this.intent.getStringExtra("tipo") != null) {
            tipo = this.intent.getStringExtra("tipo")
            if (tipo.toLowerCase() == "enfermagem") {

                for (i in 1..3) {
                    val random = Random()
                    itens[i] = Quartos(i, "Quarto - " + i, "Fulano", "Beltrano", status[random.nextInt(3)])
                }

            }
        }
    }
}

data class Quartos(
    var id: Int,
    var nome: String,
    var responsavelEnfermagem: String,
    var responsavelLimpeza: String,
    var status: String
)
