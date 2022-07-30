
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()

    for (i in a..b) {
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                println("FizzBuzz")
            } else {
                println("Fizz")
            }
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}