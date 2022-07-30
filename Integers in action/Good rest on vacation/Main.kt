
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val days: Int = scanner.nextInt()
    val food: Int = scanner.nextInt()
    val flight: Int = scanner.nextInt()
    val hotel: Int = scanner.nextInt()

    val sum = hotel * (days - 1) + food * days + flight * 2
    println(sum)
}