import java.util.*
import kotlin.system.exitProcess

open class Cuenta (open val numCuenta: String, open var saldo: Double) {
    open fun recibirAbono(abono: Double): Double {}
    open fun realizarPago(pago: Double): Double {}
}

class Persona(val DNI: String, var accounts: Array<Cuenta>) {
    private var numCuentas = 0
    fun addCuenta(account: Cuenta): Boolean {
        accounts.add(account)
    }
    fun esMorosa(): Boolean {}
}

fun main() {
    /**
     * Ejercicio 5.9
     */
    //val p = Persona("49078667W")
    //p.addCuenta("45931857AC",0.0)
    //p.addCuenta("53759257RV",700.0)
}