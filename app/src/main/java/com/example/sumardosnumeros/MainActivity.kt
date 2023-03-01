package com.example.sumardosnumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btSumar : Button = findViewById<Button>(R.id.btSumar)
        val et1 : EditText = findViewById<EditText>(R.id.et1)
        val et2 : EditText = findViewById<EditText>(R.id.et2)
        val tvSuma : TextView = findViewById<TextView>(R.id.tvSuma)

        btSumar.setOnClickListener {
            //Al hacer clic en el botón Sumar, sumamos el contenido de los et1 y et2
            val num1 = et1.text.toString().toInt()
            val num2 = et2.text.toString().toInt()
            val suma = num1 + num2
            tvSuma.text = suma.toString() //Mostramos el resultado en el TextView

        }
    }
}