fun main() {
    val numVal = readln().toInt()
    val values = mutableListOf<Int>()

    repeat(numVal) {
        values.add(readln().toInt())
    }

    val searchVal = readln().toInt()
    var found = "NO"
    for (value in values) {
        if (value == searchVal) {
            found = "YES"
            break
        }
    }
    println(found)
}