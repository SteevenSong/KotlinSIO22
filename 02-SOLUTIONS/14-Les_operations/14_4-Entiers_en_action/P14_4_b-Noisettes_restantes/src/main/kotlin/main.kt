fun main() {
    val nbEcureuils = readln().toInt()
    val nbNoisettes = readln().toInt()
    val reste = nbNoisettes % nbEcureuils
    println(reste)
}