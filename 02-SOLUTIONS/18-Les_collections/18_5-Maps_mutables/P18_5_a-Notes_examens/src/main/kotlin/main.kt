
fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    var nameKey = readln()
    while (nameKey != "stop") {
        val scoreValue = readln().toInt()
        if (nameKey !in studentsMarks.keys) studentsMarks[nameKey] = scoreValue
        nameKey = readln()
    }
    println(studentsMarks)
}