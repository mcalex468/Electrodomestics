package models
import extensions.*

class Rentadora {
    private var preuBase: Int = 0
    private var carrega: Int = 5

    constructor(preuBase: Int, carrega: Int) {
        this.preuBase = preuBase
        this.carrega = carrega
    }

    fun getCarrega(): Int {
        return carrega
    }

    fun getPreuBase(): Int {
        return preuBase
    }

    fun preuFinal(): Int {
        var preuFinal = preuBase
        /*carrega = readInt(
            "Introdueix la càrrega (6-10 kg):",
            "Has d'introduir un valor numeric entre 6 i 10",
            "Introdueix un valor numeric entre 6 i 10",
            6,
            10
        )*/

        preuFinal += when (carrega) {
            6, 7 -> 55
            8 -> 70
            9 -> 85
            10 -> 100
            else -> {
                println("Càrrega fora dels llindars vàlids.")
                5
            }
        }
        return preuFinal
    }
}
