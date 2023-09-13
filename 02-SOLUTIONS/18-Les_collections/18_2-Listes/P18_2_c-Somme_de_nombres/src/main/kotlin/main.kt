fun main() {
    println(solution(listOf(3, 2, 15)))
}

fun solution(numbers: List<Int>): Int {
    // put your code here
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}