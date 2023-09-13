fun main() {
    val n = readln().toInt()
    var min = 0
    for (i in 1..n) {
        val x = readln().toInt()
        if (i == 1) min = x
        if (x < min) min = x
    }
    println(min)
}