fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var s = 0
    for (i in a..b) {
        s += i
    }
    println(s)
}