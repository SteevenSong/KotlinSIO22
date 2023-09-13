fun main() {
    // Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    // write your code here
    val upVal = arrayOf(inputArray.first().first(), inputArray.first().last())
    val downVal = arrayOf(inputArray.last().first(), inputArray.last().last())
    println(upVal.joinToString(" "))
    println(downVal.joinToString(" "))
}