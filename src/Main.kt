import java.util.*

fun main() {
    // Неизменяемая коллекция
    val immutableList = listOf(1, 2, 3)
//    immutableList.add(4) // Нельзя добавить элемент
    // Делаем коллекцию изменяемой (создается новая коллекция типа ArrayList)
    val mutableImmutableList = immutableList.toMutableList()
    mutableImmutableList.add(4)

    // Изменяемая коллекция
    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)

    // Пустая коллекция (неизменяемая)
    val emptyList = emptyList<Int>()

    // Классический ArrayList из Java
    val arrayList = ArrayList<Int>(Arrays.asList(1, 2, 3))
    arrayList.add(4)

    mutableList.map {
        it * 2
    }

    println(mutableList)

}

