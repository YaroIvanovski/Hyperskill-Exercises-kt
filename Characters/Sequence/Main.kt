
fun main() {
    val a = readLine()!!.first()
    val b = readLine()!!.first()
    val c = readLine()!!.first()

    val x = b == a + 1 && c == b + 1

    println(x)
}