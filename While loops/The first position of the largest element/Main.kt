
import java.util.*
fun main() {
    val input = Scanner(System.`in`)
    var index = 1
    var num = input.nextInt()
    var max = num
    var maxIndex = 1

    while (input.hasNextInt()) {
        num = input.nextInt()
        index++
        if (num > max) {
            maxIndex = index
            max = num
        }
    }
    println("$max $maxIndex")
}