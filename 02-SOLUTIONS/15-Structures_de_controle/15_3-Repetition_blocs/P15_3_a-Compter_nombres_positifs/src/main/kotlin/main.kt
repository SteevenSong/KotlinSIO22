fun main() {
    val nbRep = readln().toInt()
    var cpt = 0

    repeat(nbRep) {
        val num = readln().toInt()
        if (num > 0) cpt++
    }
    println(cpt)
}