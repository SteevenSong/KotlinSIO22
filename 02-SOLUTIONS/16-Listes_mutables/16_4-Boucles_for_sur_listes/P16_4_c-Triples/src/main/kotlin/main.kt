fun main() {
    val nVal = readln().toInt()
    val values = mutableListOf<Int>()

    repeat(nVal) {
        values.add(readln().toInt())
    }

    var cptTriples = 0

    for (i in 0..values.lastIndex - 2) {
        var triple = true
        for (j in i..i + 1) {
            if (values[j] != values[j + 1] - 1) triple = false
        }
        if (triple) cptTriples++
    }
    println(cptTriples)
}
