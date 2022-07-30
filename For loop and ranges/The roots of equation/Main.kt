
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val a: Int = Integer.valueOf(scanner.nextLine())
    val b: Int = Integer.valueOf(scanner.nextLine())
    val c: Int = Integer.valueOf(scanner.nextLine())
    val d: Int = Integer.valueOf(scanner.nextLine())

    for (i in 0..1000) {
        if (a * i * i * i + b * i * i + c * i + d == 0) {
            println(i)
        }
    }
}