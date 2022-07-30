
fun main() {
    val h1 = readLine()!!.toInt() * 3600
    val m1 = readLine()!!.toInt() * 60
    val s1 = readLine()!!.toInt() + h1 + m1

    val h2 = readLine()!!.toInt() * 3600
    val m2 = readLine()!!.toInt() * 60
    val s2 = readLine()!!.toInt() + h2 + m2

    println(s2 - s1)
}