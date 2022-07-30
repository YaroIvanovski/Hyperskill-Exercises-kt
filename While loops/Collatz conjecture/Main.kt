
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    var x: Int = scan.nextInt()
    print("$x ")

    while (x != 1) {
        if (x % 2 == 0) {
            x /= 2
        } else {
            x = 3 * x + 1
        }
        print("$x ")
    }
}