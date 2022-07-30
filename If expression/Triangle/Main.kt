
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()
    val c: Int = scanner.nextInt()

    if (a + b > c && a + c > b && b + c > a) {
        println("YES")
    } else {
        println("NO")
    }
}