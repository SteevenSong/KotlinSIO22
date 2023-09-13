
fun main() {
    println(solution(listOf("Fred", "Pola", "Mike", "Fred"), "Fred"))
}

fun solution(strings: List<String>, str: String): Int {
    var cptName = 0
    for (name in strings) {
        if (name == str) cptName++
    }
    return cptName
}