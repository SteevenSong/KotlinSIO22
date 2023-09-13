fun main() {
    println(solution(mutableListOf("Sometimes", "you", "have", "to", "shake", "up", "your", "life"), "shake").joinToString(" "))
}


fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    // put your code here
    while (str in strings) {
        val i = strings.indexOf(str)
        strings[i] = "Banana"
    }
    return strings
}