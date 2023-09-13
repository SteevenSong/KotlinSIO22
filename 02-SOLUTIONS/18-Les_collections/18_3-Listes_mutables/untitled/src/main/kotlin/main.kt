fun main() {
    println(solution(mutableListOf("a", "b", "c", "d"), 2).joinToString())
}


fun solution(elements: MutableList<String>, index: Int): MutableList<String> {
    // put your code here
    val sol = mutableListOf<String>()
    sol.addAll(elements)
    sol.removeAt(index)
    return sol
}