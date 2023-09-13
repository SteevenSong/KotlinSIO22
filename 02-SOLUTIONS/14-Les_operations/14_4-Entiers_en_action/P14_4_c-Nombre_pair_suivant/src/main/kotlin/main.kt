fun main() {
    val entryNumber = readln().toInt()
    val nextEventNumber = 2 - entryNumber % 2 + entryNumber
    println(nextEventNumber)
}