package models

import extensions.*

class Lampada {
    //Estructura, coneguda com a propietats o atributs
    private var encendre: Boolean = false
    private var canviColor: String = "Blanc"
    private var canviIntensitat: Int = 0
    private var identificador: String? = null
    private val colorsValids = listOf("Blanc", "Cyan", "Blau", "Verd", "Vermell", "Lila")

    /*constructor(identificador: String= "Menjador",encendre: Boolean, canviColor: String, canviIntensitat: Int):this(identificador) {
        this.encendre = encendre
        this.canviColor = canviColor
        this.canviIntensitat = canviIntensitat

    }
   constructor(identificador: String = "Cuina",encendre: Boolean, canviColor: String, canviIntensitat: Int):this(identificador) {
        this.encendre = encendre
        this.canviColor = canviColor
        this.canviIntensitat = canviIntensitat

    } */
    fun identificador(identificadorActual: String) {
        identificador = identificadorActual
    }

    fun encendre() {
        encendre = true
        estatActual()
    }

    fun apagar() {
        encendre = false
        estatActual()
    }

    fun canviarColor() {
        val colorUsuari = readWord("Introdueix el color desitjat:", "Has d'escollir un color.")

        canviColor = when (colorUsuari.toLowerCase()) {
            "blanc" -> "${WHITE}$colorUsuari${RESET}"
            "cyan" -> "${CYAN}$colorUsuari${RESET}"
            "blau" -> "${BLUE}$colorUsuari${RESET}"
            "verd" -> "${GREEN}$colorUsuari${RESET}"
            "vermell" -> "${RED}$colorUsuari${RESET}"
            "lila" -> "${PURPLE}$colorUsuari${RESET}"
            in colorsValids -> colorUsuari
            else -> println("${RED_BOLD}Error: Color no vàlid. S'usarà el color per defecte: Blanc.${RESET}").toString()
        }
        estatActual()
    }


    fun canviarIntensitat() {
        do {
            canviIntensitat = readInt(
                "Introdueix la intensitat (1-5)",
                "${GREEN_BOLD} Cal introduir un valor numèric.${RESET}",
                "La intensitat ha d'estar entre 1 i 5.",
                1,
                5
            )
        } while (canviIntensitat < 5)
        estatActual()
    }

    private fun estatActual() {
        var estat = if (encendre) "${CYAN}Encesa${RESET}" else "${YELLOW}Apagada${RESET}"
        println("${identificador ?: "Làmpada"} --> Estat: $estat --> Color: ${canviColor} --> Intensitat: ${canviIntensitat}")
    }


    // Getters + Setters LAMPADA (NO els utilitzem)

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
}

/*
    override fun toString(): String {
        return ("Estat: ${if (encendre) "Encesa" else "Apagada"} --> Color: $canviColor --> Intensitat: $canviIntensitat")
    }
}
*/