fun main() {
    solution(listOf(8, 11, 3, 2))
}

fun solution(numbers: List<Int>) {
    // put your code here
    val solution = mutableListOf<Int>()

    for (num in numbers) {
        if (num % 2 == 0) solution.add(num)
    }
    println(solution.joinToString(" "))
}