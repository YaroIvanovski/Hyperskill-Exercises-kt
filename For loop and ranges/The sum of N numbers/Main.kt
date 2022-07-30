
fun main() {
    val n = readLine()!!.toInt()
    var sum = 0

    repeat(n) {
        val next = readLine()!!.toInt()
        sum += next
    }

    println(sum)
}