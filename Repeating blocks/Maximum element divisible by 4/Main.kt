
fun main() {
    val n = readLine()!!.toInt()
    var x = 0

    repeat(n) {
        val next = readLine()!!.toInt()
        if (next % 4 == 0 && next > x) {
            x = next
        }
    }
    println(x)
}
