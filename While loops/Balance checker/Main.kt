
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var balance = sc.nextInt()
    var money = 0
    while (balance >= 0 && sc.hasNextInt()) {
        money = sc.nextInt()
        balance -= money
    }
    if (balance >= 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    } else {
        println("Error, insufficient funds for the purchase. Your balance is ${balance + money}, but you need $money.")
    }
}