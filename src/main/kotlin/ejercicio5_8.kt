import kotlin.system.exitProcess

class Tiempo (var hora: Byte, var minuto: Int?, var segundo: Int?)
{
    init {
        //require(hora in 0..24) { "Introduzca una hora válida" }
        //if (hora == null) {
        //    println("La hora no debe ser nula")
        //}
        if (minuto !in 0..59) {
            minuto = 0
        }
        if (segundo !in 0..59) {
            segundo = 0
        }
    }
    override fun toString(): String {
        return "${this.hora}h ${this.minuto}m ${this.segundo}s"
    }
}

fun main() {
    /**
     * Ejercicio 5.8
     */
    println("Introduzca la hora:")
    var hora: Byte = 0
    try {
        hora = readLine()!!.toByte()
        if (hora !in 0..23) {
            println("Introduzca una hora entre 0 y 23")
            exitProcess(-1)
        }
    } catch (e: NumberFormatException) {
        println("Introduzca una hora válida")
        exitProcess(-1)
    }
    println("Introduzca los minutos:")
    val minuto = readLine()!!.toIntOrNull()
    println("Introduzca los segundos:")
    val segundo = readLine()!!.toIntOrNull()
    val time = Tiempo(hora, minuto, segundo)
    println(time)
}