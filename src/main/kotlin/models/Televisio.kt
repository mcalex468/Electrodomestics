package models

import extensions.*

class Televisio {
    private var mida: Int = 28


    fun analitzarMida(): Int {
        mida = readInt(
            "Introdueix la mida (en polzades):",
            "Has d'introduir un valor numeric",
            "Introdueix un valor numeric",
            0,
            500
        )

        return when (mida) {
            in 29..32 -> 50
            in 33..42 -> 100
            in 43..50 -> 150
            in 51..500 -> 200
            else -> {
                println("Mida fora dels llindars vàlids.")
                -1
            }
        }
    }

    fun preuFinal() {


    }
}