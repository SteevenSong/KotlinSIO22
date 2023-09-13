fun main() {
    val numVal = readln().toInt()
    val values = mutableListOf<Int>()

    repeat(numVal) {
        values.add(readln().toInt())
    }

    val searchVal = readln().toInt()
    var countVal = 0

    for (value in values) {
        if (value == searchVal) countVal++
    }
    println(countVal)
}