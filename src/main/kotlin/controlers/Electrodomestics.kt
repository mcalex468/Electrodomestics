package controlers

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

    for (electrodomestic in electrodomestics) {
        when (electrodomestic) {
            is Electrodomestic -> {
                println("Electrodomèstic:")
                println("Preu base: ${electrodomestic.getPreuBase()}€")
                println("Color: ${electrodomestic.getColor()}")
                println("Consum: ${electrodomestic.getConsum()}")
                println("Pes: ${electrodomestic.getPes()}kg")
                println("Preu Final: ${electrodomestic.preuFinal()}€")
            }

            is Rentadora -> {
                println("Rentadora:")
                println("Preu base: ${electrodomestic.getPreuBase()}€")
                println("Càrrega: ${electrodomestic.getCarrega()}kg")
                println("Preu final: ${electrodomestic.preuFinal()}€")
            }

            is Televisio -> {
                println("Televisió:")
                println("Preu base: ${electrodomestic.getPreuBase()}€")
                println("Mida: ${electrodomestic.getMida()}\"")
                println("Preu final: ${electrodomestic.preuFinal()}€")
            }
        }
        println()
    }
}