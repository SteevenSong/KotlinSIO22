
fun main() {
    println(solution(setOf("Hello", "it's", "you", "me"), "you"))
}

fun solution(elements: Set<String>, element: String): MutableSet<String> {
    // put your code here
    val result = mutableSetOf<String>()
    result.addAll(elements)
    result.remove(element)
    return result
}