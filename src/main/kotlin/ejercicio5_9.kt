import jdk.nashorn.internal.objects.NativeArray.forEach
import java.util.*
import kotlin.system.exitProcess

open class Cuenta (open val numCuenta: String, open var saldo: Double) {
    open fun recibirAbono(abono: Double): Double {
        saldo += abono
        return saldo
    }
    open fun realizarPago(pago: Double): Double {
        saldo -= pago
        return saldo
    }
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
        run a@{
            accounts.forEach {
                if (it!!.saldo < 0.0) {
                    return@a
                }
            }
            return true
        }
        return false
    }
}

fun main() {
    /**
     * Ejercicio 5.9
     */
    val p = Persona("49078667W")
    val c1 = Cuenta("45931857AC",0.0)
    val c2 = Cuenta("45931857BD",700.0)
    p.addCuenta(Cuenta("45931857AC",0.0))
    p.addCuenta(Cuenta("45931857BD",700.0))
    c1.recibirAbono(1100.0)
    c2.realizarPago(750.0)
    p.esMorosa()
}