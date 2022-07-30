
import kotlin.math.abs

fun getLastDigit(a: Int): Int {
    val lastDigit = a % 10
    return abs(lastDigit)
//  return a.toString().last().digitToInt()
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}