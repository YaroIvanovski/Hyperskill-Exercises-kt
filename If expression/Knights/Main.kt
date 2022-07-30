
import java.util.*
import kotlin.math.abs

fun main() {
    val sc = Scanner(System. `in` )

    val x1 = sc.nextInt()
    val y1 = sc.nextInt()
    val x2 = sc.nextInt()
    val y2 = sc.nextInt()

    print(if (abs((x1 - x2) * (y1 - y2)) == 2) "YES" else "NO")

}