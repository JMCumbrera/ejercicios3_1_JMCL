class Rectangle (var base: Int, var altura: Int)
{
    private var area: Int = 0
    private var perimetro: Int = 0
    private var res = ""

    override fun toString (): String
    {
        area = base * altura
        perimetro = (base * 2) + (altura * 2)
        res = "El perimetro del rectángulo es $perimetro y el área es $area"
        return res
    }
}

fun main() {
    /**
     * Ejercicio 5.6
     */

    val r1 = Rectangle(5,5)
    val r2 = Rectangle(5,6)
    val r3 = Rectangle(6,7)
    val r4 = Rectangle(7,8)

    println(r1.toString())
    println(r2.toString())
    println(r3.toString())
    println(r4.toString())
}