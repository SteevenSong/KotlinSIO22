fun main() {
    println(solution(listOf(8, 11, 13, 14), 1).joinToString())
}

fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    val sol = mutableListOf<Int>()
    sol.addAll(numbers)
    sol.add(number)
    return sol
}