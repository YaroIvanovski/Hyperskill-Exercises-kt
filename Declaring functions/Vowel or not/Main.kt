/*
fun isVowel(letter: Char): Boolean {
    val vowels = charArrayOf('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U')
    return vowels.contains(element = letter)
}
*/
fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}

fun isVowel(letter: Char) = letter.uppercase() in "AEIOU"

