package models

import extensions.*

class Electrodomestic {

    private var color: String = "blanc"
    private var consum: String = "G"
    private var pes: Int = 5
    private val colorsValids = listOf("Blanc", "Cyan", "Blau", "Verd", "Vermell", "Lila")


    fun consum(): Int {
        val lletraUsuari = readWord("Introdueix la lletra:", "Has d'escollir una lletra A-G.")

        consum = when (lletraUsuari.toUpperCase()) {
            "A" -> 35
            "B" -> 30
            "C" -> 25
            "D" -> 20
            "E" -> 15
            "F", "G" -> 0
            else -> {
                println("${RED_BOLD}Error: Lletra no vàlida. S'usarà el valor per defecte: 0.${RESET}")
                0
            }
        }
        //estatActual()
    }


    fun pes() {
        val pesUsuari = readInt(
            "Introdueix el pes:",
            "Has d'introduir un pes (Enter)",
            "Introdueix un valor numeric enter",
            0,
            1000
        )

        pes = when (pesUsuari) {
            in 0..5 -> 0
            in 6..20 -> 20
            in 21..50 -> 50
            in 51..80 -> 80
            in 81..1000 -> 100
            else -> {
                println("Pes fora dels llindars vàlids.")
                -1 // Qualsevol valor que indiqui un rang no vàlid
            }
        }
        //estatActual()
    }

    fun color() {
        val colorUsuari = readWord("Introdueix el color desitjat:", "Has d'escollir un color.")

        color = when (colorUsuari.toLowerCase()) {
            "blanc" -> "${WHITE}$colorUsuari${RESET}"
            "cyan" -> "${CYAN}$colorUsuari${RESET}"
            "blau" -> "${BLUE}$colorUsuari${RESET}"
            "verd" -> "${GREEN}$colorUsuari${RESET}"
            "vermell" -> "${RED}$colorUsuari${RESET}"
            "lila" -> "${PURPLE}$colorUsuari${RESET}"
            in colorsValids -> colorUsuari
            else -> println("${RED_BOLD}Error: Color no vàlid. S'usarà el color per defecte: Blanc.${RESET}").toString()
        }
        //estatActual()
    }


    fun preuFinal() {


    }
}


/*
    // Getters + Setters LAMPADA

    fun getEncendre(): Boolean {
        return encendre
    }

    fun setEncendre(encendre: Boolean) {
        this.encendre = encendre
    }

    fun getcanviColor(): String {
        return canviColor
    }

    fun setcanviColor(canviColor: String) {
        this.canviColor = canviColor
    }

    fun getcanviIntensitat(): Int {
        return canviIntensitat
    }

    fun setcanviIntensitat(canviIntensitat: Int) {
        this.canviIntensitat = canviIntensitat
    }



    override fun toString(): String {
        return ("Estat: ${if (encendre) "Encesa" else "Apagada"} --> Color: $canviColor --> Intensitat: $canviIntensitat")
    }
}
*/