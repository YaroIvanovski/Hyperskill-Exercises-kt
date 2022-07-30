
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val x1: Int = scanner.nextInt()
    val y1: Int = scanner.nextInt()
    val x2: Int = scanner.nextInt()
    val y2: Int = scanner.nextInt()

    if (y1 == y2 || x1 == x2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
        println("YES")
    } else {
        println("NO")
    }
}