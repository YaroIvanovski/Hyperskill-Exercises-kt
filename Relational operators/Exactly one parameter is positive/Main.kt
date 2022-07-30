
fun main() {
    val a: Boolean = readLine()!!.toInt() > 0
    val b: Boolean = readLine()!!.toInt() > 0
    val c: Boolean = readLine()!!.toInt() > 0

    println(a xor b xor c xor (a && b && c))
}