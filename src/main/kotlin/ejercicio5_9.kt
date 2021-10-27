import jdk.nashorn.internal.objects.NativeArray.forEach
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
        return if (numCuentas < 4) {
            accounts[numCuentas] = account
            numCuentas++
            true
        } else false
    }
    fun esMorosa(): Boolean {
        accounts.forEach {
            if (it?.saldo!! < 0.0) {
                return true
            }
        }
        return false
    }
}

fun main() {
    /**
     * Ejercicio 5.9
     */
    val p = Persona("49078667W")
    p.addCuenta(Cuenta("45931857AC",0.0))
    p.addCuenta(Cuenta("45931857BD",700.0))
    p.esMorosa()
    //p.addCuenta("53759257RV",700.0)
}