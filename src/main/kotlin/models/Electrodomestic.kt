package models
import extensions.*

class Electrodomestic {

    private var preuBase: Int = 0
    private var color: String = "blanc"
    private var consum: String = "G"
    private var pes: Int = 5

    constructor(preuBase: Int, color: String, consum: String, pes: Int) {
        this.color = color
        this.preuBase = preuBase
        this.consum = consum
        this.pes = pes
    }

    fun consum() {
        /* val lletraUsuari = readWord("Introdueix la lletra:", "Has d'escollir una lletra A-G.")*/

        consum = when (consum.toUpperCase()) {
            "A" -> 35.toString()
            "B" -> 30.toString()
            "C" -> 25.toString()
            "D" -> 20.toString()
            "E" -> 15.toString()
            "F" -> 10.toString()
            "G" -> 0.toString()
            else -> ({
                println("${RED_BOLD}Error: Lletra no vàlida. S'usarà el valor per defecte: 0.${RESET}")
                0
            }).toString()
        }
    }


    fun pes() {
        /*val pesUsuari = readInt(
                "Introdueix el pes:",
                "Has d'introduir un pes (Enter)",
                "Introdueix un valor numeric enter",
                0,
                1000
            )*/

        pes = when (pes) {
            in 0..5 -> 0
            in 6..20 -> 20
            in 21..50 -> 50
            in 51..80 -> 80
            in 81..1000 -> 100
            else -> {
                println("${RED_BOLD}Pes fora dels llindars vàlids.${RESET}")
                -1 // Qualsevol valor que indiqui un rang no vàlid
            }
        }
    }

    fun color() {
        color = when (color.toLowerCase()) {
            "blanc", "platejat" -> color
            else -> {
                println("${RED_BOLD}Error: Color no vàlid. S'utilitzar el color predeterminat: Blanc.${RESET}")
                "blanc"
            }
        }
    }

    fun preuFinal(): Int {
        var preuFinal = preuBase

        preuFinal += when (consum) {
            "A" -> 35
            "B" -> 30
            "C" -> 25
            "D" -> 20
            "E" -> 15
            "F" -> 10
            "G" -> 0
            else -> 0
        }

        preuFinal += when (pes) {
            in 0..5 -> 0
            in 6..20 -> 20
            in 21..50 -> 50
            in 51..80 -> 80
            in 81..120 -> 100
            else -> {
                println("${RED_BOLD}El pes es troba fora del llindar màxim!.${RESET}")
                5
            }
        }
        return preuFinal
    }

    fun getPreuBase(): Int {
        return preuBase
    }

    fun getColor(): String {
        return color
    }

    fun getConsum(): String {
        return consum
    }

    fun getPes(): Int {
        return pes
    }
}

