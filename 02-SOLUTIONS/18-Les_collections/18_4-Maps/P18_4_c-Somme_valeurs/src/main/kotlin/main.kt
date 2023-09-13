

fun main() {
    println(summator(mapOf(100 to 10, 55 to 3, 112 to 5)))
    println(summator(mapOf(1 to 2, 10 to 5)))
}

fun summator(map: Map<Int, Int>): Int {
    // put your code here
    var sum = 0
    for (pair in map) {
        if (pair.key % 2 == 0) sum += pair.value
    }
    return sum
}
