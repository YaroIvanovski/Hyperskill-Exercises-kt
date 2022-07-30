
fun main() {
    val n = readLine()!!.toInt()
    var numPrev = 0
    var count = 0
    for (i in 1..n) {
        val num = readLine()!!.toInt()
        count = if (numPrev <= num) ++count else count
        numPrev = num
    }
    println(if (count == n) "YES" else "NO")
}

