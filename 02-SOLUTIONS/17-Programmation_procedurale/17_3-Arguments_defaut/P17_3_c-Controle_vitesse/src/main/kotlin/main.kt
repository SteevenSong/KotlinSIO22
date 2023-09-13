fun checkSpeed(speed: Int, limit: Int = 60) {
    println(if (speed <= limit) "Within the limit" else "Exceeds the limit by ${speed - limit} kilometers per hour")
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}