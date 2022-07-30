
fun main() {
    val n = readLine()!!.toInt()
    var previous = readLine()!!.toInt()
    var counter = 1
    var max = 1
    for (i in 2..n) {
        val num = readLine()!!.toInt()
        if (num >= previous) {
            counter ++
            if (counter > max) {
                max = counter
            }
        } else {
            counter = 1
        }
        previous = num
    }
    println(max)
}