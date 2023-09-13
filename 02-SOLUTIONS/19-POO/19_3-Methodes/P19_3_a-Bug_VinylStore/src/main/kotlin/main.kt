// fix it
class VinylStore(val vinyl: String) {
    fun printVinyl() {
        println(this.vinyl)
    }
}

fun main() {
    val myStore = VinylStore("Vinyl Record")
    myStore.printVinyl()
}