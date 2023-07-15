package chl.ancud.m5_individual13_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/// Parte A
fun main() {
    var resultado = suma(5.5, 6.4f)
    println(resultado)
    var redondeo = redondeo(5.3)
    println(redondeo)
    var muestraResultado = muestraResultado(8.57)
    println(muestraResultado)
}

fun suma (param1: Double, param2: Float): Double = param1 + param2

fun redondeo(param1: Double) = ceil(param1)

fun muestraResultado(numero: Double) : String {
    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    println(format.format(numero))
    return format.format(numero)
}


