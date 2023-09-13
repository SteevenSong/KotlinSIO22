class Kitty {
    // write here
    var color: String
    var age: Int

    init {
        color = ""
        age = 0
    }

    constructor(color: String, age: Int) {
        this.color = color
        this.age = age
    }
    constructor(age: Int, color: String) {
        this.color = color
        this.age = age
    }
    constructor(color: String) {
        this.color = color
    }
    constructor(age: Int) {
        this.age = age
    }
}

fun main() {
    val garfield = Kitty("orange", 7)
    val tom = Kitty(8, "grey")
    val grominet = Kitty("black")
    val kitty = Kitty(3)
}