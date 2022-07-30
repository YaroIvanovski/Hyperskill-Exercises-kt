
fun main() {
    val cups: Int = readLine()!!.toInt()
    val weekend: Boolean = readLine()!!.toBoolean()

    val workDay = cups in 10..20 && !weekend
    val weekDay = cups in 15..25 && weekend

    println(workDay || weekDay)
}