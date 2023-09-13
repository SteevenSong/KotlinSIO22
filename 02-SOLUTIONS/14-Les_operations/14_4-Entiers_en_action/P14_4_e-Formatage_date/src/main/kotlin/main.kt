const val NBR_SECONDS_BY_DAY = 24 * 3_600

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    val totalSecondsThisDay = totalSeconds % NBR_SECONDS_BY_DAY
    val hrs = totalSecondsThisDay / 3_600
    val min = totalSecondsThisDay % 3_600 / 60
    val sec = totalSecondsThisDay % 3_600 % 60

    println("$hrs:$min:$sec")
}