
fun main() {
    var a = readLine()!!.toInt()
    var reverse = 0
    while (a != 0) {
        reverse = reverse * 10 + a % 10
        a /= 10
    }
    println(reverse)
}