
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val x = a != b && a != c && b != a && b != c && c != a && c != b

    println(x)
}