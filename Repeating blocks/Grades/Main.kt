
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()

    var num = 0
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    for (i in 0 until n) {
        num = scanner.nextInt()
        if (num == 5) {
            a += 1
        } else if (num == 4) {
            b += 1
        } else if (num == 3) {
            c += 1
        } else if (num == 2) {
            d += 1
        }
    }
    println("$d $c $b $a")
}