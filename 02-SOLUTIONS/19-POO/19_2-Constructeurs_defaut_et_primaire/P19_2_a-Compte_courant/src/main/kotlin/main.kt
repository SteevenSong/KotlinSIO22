// write the BankAccount class here
class BankAccount (var deposited: Long, var withdrawn: Long) {
    var balance: Long = deposited - withdrawn
}

fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}