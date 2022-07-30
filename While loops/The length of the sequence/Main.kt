
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var count = -1
    var input: Int
    while (true) {
        input = scanner.nextInt()
        count++
        if (input == 0) {
            break
        }
    }
    println(count)
}