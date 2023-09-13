fun main() {
    var s = 0
    do {
        var x = readln()!!.toInt()
        s += x
    } while (x != 0)
    println(s)
}