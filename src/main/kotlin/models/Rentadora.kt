package models

import extensions.*

class Rentadora {
    private var carrega: Int = 5


    fun carrega(): Int {
        carrega = readInt(
            "Introdueix la càrrega (6-10 kg):",
            "Has d'introduir un valor numeric entre 6 i 10",
            "Introdueix un valor numeric entre 6 i 10",
            6,
            10
        )

        return when (carrega) {
            6, 7 -> 55
            8 -> 70
            9 -> 85
            10 -> 100
            else -> {
                println("Càrrega fora dels llindars vàlids.")
                // Puedes elegir qué valor devolver en caso de error, por ejemplo:
                throw IllegalArgumentException("Càrrega fora dels llindars vàlids.")
            }
        }
    }

    fun preuFinal() {


    }
}
