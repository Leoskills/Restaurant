package com.leonardo.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var CantidadPastelChoclo=findViewById<EditText>(R.id.ingresar1)
        var CantidadCazuela=findViewById<EditText>(R.id.ingresar2)
        var resultadoPastel=findViewById<TextView>(R.id.resultadoPastel)
        var resultadoCazuela=findViewById<TextView>(R.id.resultadoCazuela)
        var SubTotal1=findViewById<TextView>(R.id.SubTotal1)
        var Total1=findViewById<TextView>(R.id.Total1)
        var switchPropina=findViewById<Switch>(R.id.switchPropina)


        resultadoPastel.setOnClickListener{
            var CalcularPastel=(CantidadPastelChoclo.text.toString().toInt())*1200

            resultadoPastel.setText(
                CalcularPastel.toString()
            )
        }

        resultadoCazuela.setOnClickListener{
            var CalcularCazuela=(CantidadCazuela.text.toString().toInt())*1000

            resultadoCazuela.setText(
                CalcularCazuela.toString()
            )
        }
        SubTotal1.setOnClickListener{
            var CalcularSubTotal=(resultadoCazuela.text.toString().toInt())+(resultadoPastel.text.toString().toInt())

            SubTotal1.setText(
                CalcularSubTotal.toString()
            )
        }
        Total1.setOnClickListener{
            var CalcularTotal1=(SubTotal1.text.toString().toInt())
            Total1.setText(
                CalcularTotal1.toString()
            )
        }


    }

}
