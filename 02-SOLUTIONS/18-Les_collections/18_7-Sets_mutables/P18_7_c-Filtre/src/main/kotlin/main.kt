
fun main() {
    println(evenFilter(setOf(1, 2, 3, 4, 5, 6, 7, 8)))
}



fun evenFilter(numbers: Set<Int>): Set<Int> {
    // put your code here
    val workSet = mutableSetOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) workSet.add(number)
    }
    return workSet.toSet()
}