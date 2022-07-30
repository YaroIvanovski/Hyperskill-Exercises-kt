
fun main() {
    val invitation = readLine().toBoolean()
    val gift = readLine().toBoolean()
    val check = gift && invitation
    print(check)
}