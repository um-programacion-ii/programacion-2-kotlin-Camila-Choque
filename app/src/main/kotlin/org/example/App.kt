package org.example
import kotlin.math.PI

// Escribir una interface perimetrable con un metodo calcularPerimetro()
// Escribir una clase Rectangulo que implemente la interface Perimetrable
// Escribir una clase Circulo que implemente la interface Perimetrable   
// Crear una lista con un objeto de cada clase y mostrar el perimetro de cada uno

interface Perimetrable {
    fun calcularPerimetro(): Double
}


class Rectangulo(val ancho: Double, val alto: Double) : Perimetrable {

    override fun calcularPerimetro(): Double {
        return 2 * (ancho + alto)
    }
}

class Circulo(val radio: Double) : Perimetrable {

    override fun calcularPerimetro(): Double {
        return 2 * PI * radio
    }
}


class Coche(private var _marca: String = "Ford", private var _modelo: Int = 2020) {
    var marca: String
        get() = _marca
        set(value) {
            _marca = value
        }
    var modelo: Int
        get() = _modelo
        set(value) {
            _modelo = value
        }
}

/* 
class Rectangulo(val ancho: Double, val alto: Double) {
    var area: Double

    init {
        area = ancho * alto
        println("Se ha creado un rectángulo de $ancho x $alto con un área de $area")
    }

    fun describir() {
        println("Este es un rectángulo.")
    }

    fun calcularPerimetro(): Double {
        return 2 * (ancho + alto)
    }
}

*/


fun main() {

     val figuras: List<Perimetrable> = listOf(
        Rectangulo(5.0, 3.0),
        Circulo(4.0)
    )
     println("------------------------------------")

    for (figura in figuras) {
        println("Perímetro: ${figura.calcularPerimetro()}")
    }

     println("------------------------------------")

    val coche = Coche("Chevrolet", 2025)
    println("Marca ${coche.marca}")
    println("Modelo ${coche.modelo}")


}