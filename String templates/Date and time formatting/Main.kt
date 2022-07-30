
fun main() {
    val (h, m, s) = readLine()!!.split(' ')
    val (da, mo, y) = readLine()!!.split(' ')
    val t = "$h:$m:$s "
    val d = "$da/$mo/$y"
    println("$t$d")

}