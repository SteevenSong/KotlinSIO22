class LewisCarrollBook {
    var name = ""
        get() {
            println("The name of the book is $field")
            return field
        }
        set(value) {
            field = value
            println("Now, a book called $field")
        }
    var author = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }
    var price = 0
        get() {
            return field
        }
        set(value) {
            println("Putting a new price...")
            field = value
            println("The new price is $field")
        }
}

fun main() {
    val alicesAdventuresInWonderland = LewisCarrollBook()
    alicesAdventuresInWonderland.name = "Alice's Adventures in Wonderland"

    println(alicesAdventuresInWonderland.author)
    alicesAdventuresInWonderland.price = 10
}