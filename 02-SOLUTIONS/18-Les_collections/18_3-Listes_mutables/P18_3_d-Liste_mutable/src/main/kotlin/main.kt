fun main() {
    val nameCount = names(listOf("Vasya", "Olga", "Vasya", "Dima", "Masha", "Vasa", "Olga"))
    for (result in nameCount) {
        println(result)
    }
}

fun names(namesList: List<String>): List<String> {
    var count = 0
    val nameCount = mutableListOf<String>()
    //
    // add your code here
    val nameTreated = mutableListOf<String>()
    for (i in 0..namesList.lastIndex) {
        if (namesList[i] in nameTreated) continue else nameTreated.add(namesList[i])
        count = 1
        for (j in i + 1..namesList.lastIndex) {
            if (namesList[j] == namesList[i]) count++
        }
        nameCount.add("The name ${namesList[i]} is repeated $count times")
    }
    return nameCount
}