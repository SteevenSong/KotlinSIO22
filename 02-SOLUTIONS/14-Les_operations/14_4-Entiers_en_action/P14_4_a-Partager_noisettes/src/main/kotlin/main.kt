fun main() {
    val nbEcureuils = readln().toInt()
    val nbNoisettes = readln().toInt()
    val nbNoisettesParEcureuils = (nbNoisettes / nbEcureuils).toInt()
    println(nbNoisettesParEcureuils)
}