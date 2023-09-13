fun main() {
    println(createMutableList().joinToString())
}


fun createMutableList(): MutableList<String> {
    // Insérer ci-dessous votre liste
    val capitals = mutableListOf("Tokyo", "Moscow", "Paris", "Washington", "Beijing")

    return capitals
}