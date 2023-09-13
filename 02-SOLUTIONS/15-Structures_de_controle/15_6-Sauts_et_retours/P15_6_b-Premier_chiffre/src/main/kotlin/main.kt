fun main() {
    val entry = readln()
    for (char in entry) {
        if (char in '0'..'9') {
            println(char)
            break
        }
    }
}