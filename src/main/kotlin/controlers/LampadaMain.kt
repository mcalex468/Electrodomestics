package controlers
import extensions.*
import models.Lampada

fun main() {

    var lampadaMenjador: Lampada = Lampada()
    lampadaMenjador.identificador("Làmpada Menjador")
    lampadaMenjador.encendre()
    repeat(3) { lampadaMenjador.canviarColor() }
    lampadaMenjador.canviarIntensitat()

    var lampadaCuina: Lampada = Lampada()
    lampadaCuina.identificador("Làmpada Cuina")
    lampadaCuina.encendre()
    repeat(2) { lampadaCuina.canviarColor() }
    lampadaCuina.canviarIntensitat()
    lampadaCuina.apagar()
    lampadaCuina.canviarColor()
    lampadaCuina.encendre()
    lampadaCuina.canviarColor()
    lampadaCuina.canviarIntensitat()

}






    /* ESTABA INCORRECTE
      println("LAMPADA MENJADOR")
    var lampadaMenjador: Lampada = Lampada("Menjador")
    lampadaMenjador.encendre()
    println(lampadaMenjador)
    lampadaMenjador.canviarColor("Blau")
    println(lampadaMenjador)
    lampadaMenjador.canviarColor("Groc")
    println(lampadaMenjador)
    lampadaMenjador.canviarColor("Verd")
    println(lampadaMenjador)
    lampadaMenjador.canviarIntensitat(1)
    println(lampadaMenjador)
    // println("control")
    lampadaMenjador.canviarIntensitat(2)
    println(lampadaMenjador)
    lampadaMenjador.canviarIntensitat(3)
    println(lampadaMenjador)
    lampadaMenjador.canviarIntensitat(4)
    println(lampadaMenjador)
    lampadaMenjador.canviarIntensitat(5)
    println(lampadaMenjador)

    println("LAMPADA CUINA")
    var lampadaCuina: Lampada = Lampada("Cuina")
    lampadaCuina.encendre()
    println(lampadaMenjador)
    lampadaCuina.canviarColor("Vermell")
    println(lampadaMenjador)
    lampadaCuina.canviarColor("Violeta")
    println(lampadaMenjador)
    lampadaCuina.canviarIntensitat(1)
    println(lampadaMenjador)
    // println("control")
    lampadaCuina.canviarIntensitat(2)
    println(lampadaMenjador)
    lampadaCuina.canviarIntensitat(3)
    println(lampadaMenjador)
    lampadaCuina.canviarIntensitat(4)
    println(lampadaMenjador)
    lampadaCuina.canviarIntensitat(5)
    println(lampadaMenjador)
    lampadaCuina.apagar()
    println(lampadaMenjador)
    lampadaCuina.canviarColor("Lila")
    println(lampadaMenjador)
    lampadaCuina.encendre()
    println(lampadaMenjador)
    lampadaCuina.canviarColor("Rosa")
    println(lampadaMenjador)
    println("control")
    lampadaCuina.canviarIntensitat(5)
    println()
     */




