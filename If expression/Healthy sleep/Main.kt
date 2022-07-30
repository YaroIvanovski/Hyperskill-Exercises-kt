
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()
    val h: Int = scanner.nextInt()

    if (h < a) {
        println("Deficiency")
    } else if (h > b) {
        println("Excess")
    } else if (a <= b) {
        println("Normal")
    }
}