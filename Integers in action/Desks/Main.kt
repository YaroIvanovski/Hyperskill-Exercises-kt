
import java.util.*
import kotlin.math.ceil

fun main() {
    val scanner = Scanner(System.`in`)

    val one = ceil((scanner.nextInt().toFloat() / 2).toDouble()).toInt()
    val two = ceil((scanner.nextInt().toFloat() / 2).toDouble()).toInt()
    val three = ceil((scanner.nextInt().toFloat() / 2).toDouble()).toInt()

    println(one + two + three)
}