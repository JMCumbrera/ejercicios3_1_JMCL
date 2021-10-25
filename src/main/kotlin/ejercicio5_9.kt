import java.util.*
import kotlin.system.exitProcess

open class Cuenta (open val numCuenta: String, open var saldo: Double) {
    open fun recibirAbono(abono: Double): Double {}
    open fun realizarPago(pago: Double): Double {}
}

class Persona(val DNI: String) {
    private var accounts: Array<Cuenta?> = arrayOfNulls<Cuenta>(3)

    private var numCuentas = 0
    fun addCuenta(account: Cuenta): Boolean {
        var i: Int = 0
        return if (i < 4) {
            accounts[i] = account
            i++
            true
        } else {
            false
        }
    }
    fun esMorosa(): Boolean {}
}

fun main() {
    /**
     * Ejercicio 5.9
     */
    val p = Persona("49078667W")
    p.addCuenta("45931857AC")
    //p.addCuenta("53759257RV",700.0)
}