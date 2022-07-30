
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val number: Int = Integer.valueOf(scan.nextLine())

    if (number % 2 == 0) {
        println(number + 2)
    } else {
        println(number + 1)
    }
}