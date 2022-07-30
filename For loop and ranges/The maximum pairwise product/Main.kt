
fun main() {
    val n = readLine()!!.toInt()
    var num: Int
    var maxPrevious = 0
    var max = 1
    for (i in 1..n) {
        num = readLine()!!.toInt()
        if (num >= max) {
            maxPrevious = max
            max = num
        } else if (num >= maxPrevious) {
            maxPrevious = num
        }
    }
    println(max * maxPrevious)
}