package controlers
import models.Electrodomestic
import models.Rentadora
import models.Televisio

fun main() {
    val electrodomestics = arrayOf(
        Electrodomestic("blanc", "G", 30),
        Electrodomestic("Nevera", 500.0, "Gris", 40),
        Electrodomestic("Aspiradora", 150.0, "Vermell", 5),
        Electrodomestic("Rentadora", 200.0, "Blau", 8),
        Electrodomestic("Televisió", 700.0, "Negre", 15),
        Electrodomestic("Microones", 100.0, "Platejat", 10),
        Rentadora(250),
        Rentadora(200),
        Televisio(55),
        Televisio(70)
    )
}

