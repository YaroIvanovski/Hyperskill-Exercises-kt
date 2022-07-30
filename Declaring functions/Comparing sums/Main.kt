
fun isGreater(num1: Int, num2: Int, num3: Int, num4: Int) = num1 + num2 > num3 + num4

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    val num4 = readLine()!!.toInt()

    println(isGreater(num1, num2, num3, num4))
}