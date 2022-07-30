
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val number: Int = Integer.valueOf(scan.nextLine())

    if (number % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
    }
}