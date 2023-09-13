fun main() {
    val nbr3chiffres = readln().toInt()
    val chiffre1 = nbr3chiffres / 100
    val chiffre2 = nbr3chiffres / 10 % 10
    val chiffre3 = nbr3chiffres % 10
    val somme = chiffre1 + chiffre2 + chiffre3
    println(somme)
}