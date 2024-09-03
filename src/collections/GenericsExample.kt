package collections

import java.math.BigDecimal

/*
* Jvm doesn't understand generics
* */

fun main() {

    val list = mutableListOf("Hello")
    list.add("another string")
    list.printCollection()

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99),
    BigDecimal(0.988)
    )
    bdList.printCollection()

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short> = listOf(10, 20, 30, 40, 50)
    val floats: List<Float> = listOf(3f, 4.5f, 6.32f, 6.2f)
    val strings = listOf("1", "2", "3", "4")
    var listAny: Any = listOf("1", "2", "3", "4")

    if (strings is List<String>)
        println("This list contains strings")

    if (listAny is List<*>)
        println("Yes, this is a list. Thank you star projection")

//    listAny = listOf(1, 2, 3)
//    if (listAny is List<*>) {
//        println("This list contains strings")
//        val strList = listAny as List<String>
//        println(strList[1].replace("2", "two"))
//    }

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

    append(StringBuilder("Raj"), StringBuilder("Aryan"))

    printCollection1(shorts)
    printCollection1(floats)

    val mixedList: List<Any> = mutableListOf("Raj", "Aryan", 1, 2, BigDecimal(12355))
    val stringOnly = getElementsOfType<String>(mixedList)
    stringOnly.forEach { println(it) }
}
//
//fun <T> printCollection(collection: List<T>) {
//    for (item in collection)
//        println(item)
//}

fun <T> List<T>.printCollection() {
    for(item in this)
        println(item)
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for(item in collection)
        println("${item?.toInt()}")
}

fun <T> append(item1: T, item2: T) where T: CharSequence, T:Appendable {
    println("Result is ${item1.append(item2)}")
}

fun <T: Any> printCollection1(collection: List<T>) {
    for(item in collection)
        println(item)
}

/*use reified and inline to find type variable at runtime*/

inline fun <reified T> getElementsOfType(list: List<Any>) : List<T> {
    var newList: MutableList<T> = mutableListOf();
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}
