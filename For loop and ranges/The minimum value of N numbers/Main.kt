
fun main() {
    val n = readLine()!!.toInt()
    var min = Int.MAX_VALUE
    for (i in 0 until n) {
        val temp = readLine()!!.toInt()
        if (temp < min) {
            min = temp
        }
    }
    println(min)
}