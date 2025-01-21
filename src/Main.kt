fun main() {
}

private fun stringConstructor() {
    // Создание с помощью строковых литералов
    val str = "This is text"
    // Создание с помощью конструктора
    val constructorStr = java.lang.String("This is text")
}

private fun stringMethods() {
    val str = "Hello world"
    // Длина строки. Пробел тоже символ и учитывается при подсчете
    println(str.length)

    // Конкатенация строк
    val concatStr = "$str !"
    println(concatStr)

    var newStr = "$concatStr new text"
    println(newStr)

    newStr += " some text"
    println(newStr)
}

private fun numberToString() {
    val number = 10
    val number2 = 10.0
    val variant1 = number.toString() + ""
    println("Variant 1: $variant1")
    val variant2 = number.toString()
    println("Variant 2: $variant2")
    val variant3 = number.toString()
    println("Variant 3: $variant3")
    val variant3WithDouble = number2.toString()
    println("Variant 3_double: $variant3WithDouble")
}

private fun stringToNumber() {
    val str = "10"
    val number: Int = str.toInt()
    val number2: Double = str.toDouble()
    val number3: Float = str.toFloat()
    println(number)
    println(number2)
    println(number3)
}

private fun stringBuilderExample() {
    val sb = StringBuilder()
    sb.append("Hello")
    println(sb)
    // offset - индекс, начиная с которого будет происходить вставка новой строки
    sb.insert(0, "world")
    println(sb)
    // start - включительно end - исключительно
    sb.replace(0, 5, "")
    println(sb)
    // start - включительно end - исключительно
    sb.delete(0, 5)
    println(sb)

    val newSb = StringBuilder("Hello world")
    newSb.reverse()
    println(newSb)

    val dslBuilder = buildString {
        append("Hello")
        reverse()
    }

    val values = listOf(1, 2, 3, 4)
    for (i in values) {
        println(values[i])
    }

    println(dslBuilder)

}

