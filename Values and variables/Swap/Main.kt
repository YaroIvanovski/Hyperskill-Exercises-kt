
fun main() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    // Write only exchange actions here. Do not touch the lines above
    val c = 0
        a = b.also { b = a }

    // Do not touch the lines below
    print("$a $b")
}