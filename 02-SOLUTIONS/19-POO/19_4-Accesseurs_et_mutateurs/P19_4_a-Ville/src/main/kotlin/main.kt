class City(val name: String) {
    var population: Int = 0
        set(value) {
            if (value in 0..50_000_000) {
                field = value
            } else {
                field = if (value < 0) 0 else 50_000_000
            }
        }
}

fun main() {
    val goodCity = City("Good City")
    val badCity = City("Bad City")

    badCity.population = 65_000_000
    println(badCity.population)

    goodCity.population = 45_000_000
    println(goodCity.population)
}