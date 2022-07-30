
fun main() {
    val x = readLine()!!
    val y = readLine()!!.toInt()

    val z = x[y - 1]

    println("""Symbol # $y of the string "$x" is '$z'""")
}