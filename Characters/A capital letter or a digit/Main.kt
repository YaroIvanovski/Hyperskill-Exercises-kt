
fun main() {
    val ch = readLine()!!.first()
    val x = ch in '\u0041'..'\u005A' || ch in '\u0030'..'\u0039' && ch != '0'

    println(x)
}