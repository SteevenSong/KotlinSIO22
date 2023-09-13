fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    // write your code here
    val leftUp = inputList.first().first()
    val rightUp = inputList.first().last()
    val leftDown = inputList.last().first()
    val rightDown = inputList.last().last()

    println("$leftUp $rightUp")
    println("$leftDown $rightDown")
}