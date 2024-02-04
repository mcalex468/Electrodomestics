package controlers

import extensions.GREEN_BOLD
import extensions.RED_BOLD
import extensions.RESET
import models.Electrodomestic
import models.Rentadora
import models.Televisio


fun main() {
    val electrodomestics = arrayOf(
        Electrodomestic(45, "blanc", "D", 35),
        Electrodomestic(100, "platejat", "G", 49),
        Electrodomestic(35, "blanc", "F", 5),
        Electrodomestic(55, "platejat", "A", 50),
        Electrodomestic(75, "blanc", "B", 99),
        Electrodomestic(135, "platejat", "C", 199),
        Rentadora(410, 5),
        Rentadora(270, 8),
        Televisio(310, 52),
        Televisio(150, 28),
    )

    var precioBaseTotalE = 0.0
    var precioFinalTotalE = 0.0

    var precioBaseTotalR = 0.0
    var precioFinalTotalR = 0.0

    var precioBaseTotalT = 0.0
    var precioFinalTotalT = 0.0

    for (objecte in electrodomestics) {
        when (objecte) {
            is Electrodomestic -> {
                println("Electrodomèstic:")
                println("Preu base: ${objecte.getPreuBase()}€")
                println("Color: ${objecte.getColor()}")
                println("Consum: ${objecte.getConsum()}")
                println("Pes: ${objecte.getPes()}kg")
                println("Preu Final: ${objecte.preuFinal()}€")
                precioBaseTotalE += objecte.getPreuBase()
                precioFinalTotalE += objecte.preuFinal()
            }

            is Rentadora -> {
                println("Rentadora:")
                println("Preu base: ${objecte.getPreuBase()}€")
                println("Carrega: ${objecte.getCarrega()}kg")
                println("Preu final: ${objecte.preuFinal()}€")
                precioBaseTotalR += objecte.getPreuBase()
                precioFinalTotalR += objecte.preuFinal()
            }

            is Televisio -> {
                println("Televisió:")
                println("Preu base: ${objecte.getPreuBase()}€")
                println("Mida: ${objecte.getMida()}")
                println("Preu final: ${objecte.preuFinal()}€")
                precioBaseTotalT += objecte.getPreuBase()
                precioFinalTotalT += objecte.preuFinal()
            }

        }
        println()
    }
    println("Total Electrodomestics:")
    println("Preu base total:${RED_BOLD}$precioBaseTotalE€${RESET}")
    println("Preu final total: ${GREEN_BOLD}$precioFinalTotalE€${RESET}")
    println()
    println("Total Rentadora:")
    println("Preu base total: ${RED_BOLD}$precioBaseTotalR€${RESET}")
    println("Preu final total: ${GREEN_BOLD}$precioFinalTotalR€${RESET}")
    println()
    println("Total Televisió:")
    println("Preu base total: ${RED_BOLD}$precioBaseTotalT€${RESET}")
    println("Preu final total:  ${GREEN_BOLD}$precioFinalTotalT€${RESET}")
}