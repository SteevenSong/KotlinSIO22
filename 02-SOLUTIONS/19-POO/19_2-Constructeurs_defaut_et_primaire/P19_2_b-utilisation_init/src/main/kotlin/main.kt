fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init {
        if (time !in -128..127) {
            time = if (time < -128) -128 else 127
        }
    }
}