
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var max = 0
    do {
        val x = sc.nextInt()
        if (x > max) {
            max = x
        }
    } while (x != 0)
    println(max)
}