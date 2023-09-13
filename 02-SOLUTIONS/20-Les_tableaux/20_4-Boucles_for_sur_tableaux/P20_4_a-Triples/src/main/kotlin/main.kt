fun main() {
    val numVal = readln().toInt()
    val values = IntArray(numVal)

    for (i in 0 until numVal) {
        values[i] = readln().toInt()
    }
    var cptTriples = 0
    for (i in 0..values.lastIndex - 2) {
        var testTriple = true
        for (j in i..i + 1) {
            if (values[j] != values[j + 1] - 1) {
                testTriple = false
                break
            }
        }
        if (testTriple) cptTriples++
    }
    println(cptTriples)
}
