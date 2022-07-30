
fun main() {
    val x = readLine()!!.toInt()
    if (x == 0) {
        println("zero")
    } else if (x > 0) {
        println("positive")
    } else {
        println("negative")
    }
}