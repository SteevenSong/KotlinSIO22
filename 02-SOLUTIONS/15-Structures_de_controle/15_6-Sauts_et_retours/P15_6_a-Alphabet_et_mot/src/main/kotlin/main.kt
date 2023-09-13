fun main() {
    val word = readln()
    for (char in 'a'..'z') {
        if (char in word) continue else print(char)
    }
}