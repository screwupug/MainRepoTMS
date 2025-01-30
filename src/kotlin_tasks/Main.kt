package kotlin_tasks

fun main() {
    val a = TestClass("Kirill")
    val b = TestClass("Kirill")
    println(a == b)

    val c = TestDataClass("Kirill")
    val d = TestDataClass("Kirill")
    println(c == d)

    TestClass.getInstance(name = "Kirill")
    checkStatus(1000000)
    
}

private fun checkStatus(statusCode: Int) {
    val result = when (statusCode) {
        100 -> ParcelStatus.SHIPPED
        200 -> ParcelStatus.READY_TO_SHIP
        300 -> ParcelStatus.RECEIVED
        else -> ParcelStatus.UNKNOWN
    }
    println(result)
}