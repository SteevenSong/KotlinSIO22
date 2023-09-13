fun main() {
    val x = readln().toInt()
    println(if (x < 0) "negative" else if (x > 0) "positive" else "zero")
}