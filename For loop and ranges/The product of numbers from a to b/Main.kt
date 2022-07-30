
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a: Long = scanner.nextLong()
    val b: Long = scanner.nextLong()
    var x: Long = 1

    for (i in a until b) {
        x *= i
    }
    println(x)
}