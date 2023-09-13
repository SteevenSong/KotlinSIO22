fun main() {
    println(solution(setOf("Hello", "how"), setOf("Hello", "are", "you")))
}



fun solution(first: Set<String>, second: Set<String>): Set<String> {
    return first + second
}