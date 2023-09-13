
fun main() {
    solution(listOf("Mustard", "Cheese", "Eggs", "Cola", "Eggs"), "Eggs")
}

fun solution(products: List<String>, product: String) {
    // put your code here
    val solution = mutableListOf<Int>()

    for (i in 0..products.lastIndex) {
        if (products[i] == product) solution.add(i)
    }
    println(solution.joinToString(" "))
}