fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    if (numbers.size > 1) {
        val start = 0
        val end = numbers.lastIndex
        val temp = numbers[start]
        numbers[start] = numbers[end]
        numbers[end] = temp
    }
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}