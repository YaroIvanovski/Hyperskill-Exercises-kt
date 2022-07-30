
fun main() {
    val n = readLine()!!.toInt()
    var x = 0
    repeat(n) {
        val inp = readLine()!!.toInt()
        if (inp > 0) x++
    }
    println(x)
}