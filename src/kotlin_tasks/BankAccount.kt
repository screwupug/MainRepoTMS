package kotlin_tasks

class BankAccount(
    private var account: String,
    private var balance: Int
) {

    fun getAccount(): String {
        return account
    }

    fun test() {
        println("This is static method of class java.BankAccount")
    }

    fun getBalance(): Int {
        return balance
    }

    fun withdrawMoney(value: Int) {
        val notEmpty = checkIfNotEmpty(value)
        if (notEmpty) {
            balance = balance - value
        }
    }

    fun topUpBalance(value: Int) {
        balance = balance + value
    }

    private fun checkIfNotEmpty(value: Int): Boolean {
        if (balance <= 0) return false
        val resultBalance = balance - value
        if (resultBalance < 0) return false
        return true
    }

}