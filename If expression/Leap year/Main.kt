
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val year: Int = Integer.valueOf(scanner.nextLine())

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        println("Leap")
    } else {
        println("Regular")
    }
}