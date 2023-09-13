const val FIRST_DIV = 2
const val SECOND_DIV = 3
const val THIRD_DIV = 5
const val FOURTH_DIV = 6

fun main() {
    val num = readln().toInt()

    if (num % FIRST_DIV == 0) println("Divided by $FIRST_DIV")
    if (num % SECOND_DIV == 0) println("Divided by $SECOND_DIV")
    if (num % THIRD_DIV == 0) println("Divided by $THIRD_DIV")
    if (num % FOURTH_DIV == 0) println("Divided by $FOURTH_DIV")
}