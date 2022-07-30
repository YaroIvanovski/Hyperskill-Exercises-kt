
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val x: Int = Integer.valueOf(scanner.nextLine())
    val y: Int = Integer.valueOf(scanner.nextLine())
    var sum = 0
    for (i in x..y) {
        sum += i
    }
    println(sum)

}