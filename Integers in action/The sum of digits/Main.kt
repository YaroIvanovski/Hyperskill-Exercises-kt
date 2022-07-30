
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var num: Int = scanner.nextInt()
    var sum = 0
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    println(sum)
}