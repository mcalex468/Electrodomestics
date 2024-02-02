package extensions
import java.util.*

val scan: Scanner = Scanner(System.`in`)

/**
 * This method can be used to read a String word value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readWord(pMessageIn: String
             , pMessageErrorDT: String
): String{

    var outputValue: String = ""
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.next()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}
/**
 * This method can be used to read an Int value from the user through keyboard using java.util.Scanner in within a range
 * @author raimon.izard
 * @author AlanTeixido
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @param pMessageErrorDV Data value error message to be shown to the user
 * @param pMin Min accepted value
 * @param pMax Max accepted value
 * @return outputValue Output value
 */

fun readInt(pMessageIn: String, pMessageErrorDT: String, pMessageErrorDV: String, pMin: Int, pMax: Int): Int {
    var outputValue: Int = 0
    var correctDataType: Boolean = false

    do {
        println(pMessageIn)
        correctDataType = scan.hasNextInt()

        if (!correctDataType) {
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        } else {
            outputValue = scan.nextInt()

            if (outputValue < pMin || outputValue > pMax) {
                println(YELLOW_BOLD_BRIGHT + "WARNING: " + pMessageErrorDV + RESET)
                correctDataType = false
            }
        }
        scan.nextLine()
    } while (!correctDataType)

    return outputValue
}


fun readInt(mensaje:String,intMin:Int,intMax:Int):Int{
    val scan=Scanner(System.`in`)
    var valorInt=0
    var valorCorrecto:Boolean
    do {
        println("$mensaje ")
        valorCorrecto=scan.hasNextInt()
        if (!valorCorrecto){
            println("ERROR: introdueix un nombre enter")
        }else{
            valorInt=scan.nextInt()
            if (valorInt<intMin || valorInt>intMax){
                valorCorrecto=false
                println("ERROR: introdueix un nombre entre els valors requerits")
            }
        }
        scan.nextLine()
    }while (!valorCorrecto)
    return valorInt
}


fun readDouble(mensaje:String,doubleMin:Int,doubleMax:Int):Int{
    val scan=Scanner(System.`in`)
    var valorDouble=0
    var valorCorrecto:Boolean
    do {
        print("$mensaje ")
        valorCorrecto=scan.hasNextInt()
        if (!valorCorrecto){
            println("ERROR: introdueix un nombre enter")
        }else{
            valorDouble=scan.nextInt()
            if (valorDouble<doubleMin || doubleMin>doubleMax){
                valorCorrecto=false
                println("ERROR: introdueix un nombre entre els valors requerits")
            }
        }
        scan.nextLine()
    }while (!valorCorrecto)
    return valorDouble
}


fun readBoolean(missatge:String):Boolean{
    val scan=Scanner(System.`in`)
    var valorBoolean=false
    var valorCorrecte=false
    do {
        print("$missatge ")
        valorCorrecte=scan.hasNextBoolean()
        if (!valorCorrecte){
            println("ERROR: introdueix un valor correcte")
        } else {
            valorBoolean=scan.nextBoolean()
        }
        scan.nextLine()
    }while (!valorCorrecte)
    return valorBoolean
}