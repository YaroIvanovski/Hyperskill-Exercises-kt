
import java.util.*

fun main() {
    val entrada = Scanner(System.`in`)
    val n: Int = entrada.nextInt()
    var i = 1
    while (i * i <= n) {
        println(i * i)
        i++
    }
}
