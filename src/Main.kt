import java.util.*

fun main() {
    arrayInit()
//    val a = 10
//    val b = 3
//    val c = 1.0
//    val d = 2.0
//    println(sum(a, b))
//    println(sum(c, d))
}

private fun arrayInit() {
    val first = IntArray(10)
    val second = intArrayOf(1, 2, 3, 4)
    val third = intArrayOf(1, 2, 3, 4)
    for (i in second.indices) {
        println(second[i])
    }
}

private fun sum(a: Int, b: Int): Int {
    return a + b
}

private fun sum(a: Double, b: Double) = a + b