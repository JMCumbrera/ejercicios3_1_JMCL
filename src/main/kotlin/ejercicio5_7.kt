class Car (var color: String, var marca: String, var modelo: String, var HP: Int, var NP: Int, var matricula: String)
{
    override fun toString(): String {
        return "Marca: $marca, Modelo: $modelo, Color: $color, NºCaballos: $HP, NºPuertas: $NP, Matrícula: $matricula"
    }
}

fun main() {
    /**
     * Ejercicio 5.7
     */

    val coche1 = Car("Blanco", "Mercedes","AMG", 330, 4, "4724HGD")
    coche1.color = "Negro"
    println(coche1)

    val coche2 = Car("Negro", "Bugatti","Veyron 16.4", 1000, 2, "7436AIH")
    coche2.color = "Rojo"
    println(coche2)

    val coche3 = Car("Amarillo", "Audi","TT", 250, 2, "6492HTF")
    coche3.color = "Plateado"
    println(coche3)
}