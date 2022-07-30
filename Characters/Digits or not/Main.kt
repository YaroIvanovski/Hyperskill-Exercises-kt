
fun main() {
    val a = readLine()!!.first()
    val b = readLine()!!.first()
    val c = readLine()!!.first()
    val d = readLine()!!.first()

    val isDigit = a in '\u0030'..'\u0039'
    val isDigit1 = b in '\u0030'..'\u0039'
    val isDigit2 = c in '\u0030'..'\u0039'
    val isDigit3 = d in '\u0030'..'\u0039'

    println(isDigit)
    println(isDigit1)
    println(isDigit2)
    println(isDigit3)

}