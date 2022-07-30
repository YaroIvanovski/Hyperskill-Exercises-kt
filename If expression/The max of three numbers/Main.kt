
fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(if (a > c) {
        if (b > a) b else a
    } else {
        if (b > c) b else c
    })
}