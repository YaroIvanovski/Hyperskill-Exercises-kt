
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var n: Int = sc.nextInt()
    var i: Int = 0
    while (n > 0) {
        i++
        repeat(if (i > n) n else i) { print("$i ")  }
        n -= i
    }
}