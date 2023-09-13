fun main() {
    val entry = readln()
    val nom = entry.split(" ")[0]
    val prenom = entry.split(" ")[1]
    val age = entry.split(" ")[2]

    println("${nom[0]}. $prenom, $age years old")
}