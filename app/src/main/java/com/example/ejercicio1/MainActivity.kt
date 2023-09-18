package com.example.ejercicio1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.blue


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.textView)

        val boton = findViewById<Button>(R.id.button4)

        val fondu = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.fondo)

        var cont=0


        boton.setOnClickListener {
            cont++
            if(cont%2==0) {
                texto.text = "Hola bebe"
                texto.textSize = 20F
                texto.setBackgroundColor(resources.getColor(R.color.black))
                fondu.setBackgroundColor(resources.getColor(R.color.green))

            }else{

                  texto.text="Adios bebe"
                texto.textSize= 10F
                texto.setBackgroundColor(resources.getColor(R.color.green))
                fondu.setBackgroundColor(resources.getColor(R.color.black))
            }
        }
    }
        }

