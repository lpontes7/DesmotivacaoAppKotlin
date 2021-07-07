package com.lpontes7.desmotivacao.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lpontes7.desmotivacao.R
import com.lpontes7.desmotivacao.mock.Mock
import com.lpontes7.desmotivacao.util.Constants
import com.lpontes7.desmotivacao.util.Preferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usuario.text = Preferences(this).getStoredString(Constants.Key.Name)
        frase.text = getFrase()

        botaoFrase.setOnClickListener{
            frase.text = getFrase()
        }
    }

    fun getFrase():String{
       val frase =  (Mock.Frases.ListadeFrases.indices).random()
        return Mock.Frases.ListadeFrases[frase]
    }

}
