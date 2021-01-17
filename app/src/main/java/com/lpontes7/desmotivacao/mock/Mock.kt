package com.lpontes7.desmotivacao.mock

import com.lpontes7.desmotivacao.util.Constants

class Frase(frase : String, categoria : Int )

class Mock {

    private val pegandoFogo = Constants.filtoFogo.pegandoFogo
    private val semFogo = Constants.filtoFogo.semFogo

    private val  ListadeFrases: List<Frase> = listOf(
        Frase("Nunca é tarde pra desistir", pegandoFogo),
        Frase("Acenda o fogo da sabedoria", semFogo)
    )
}