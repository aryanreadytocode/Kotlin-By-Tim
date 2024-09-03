package arrays

import data_types.javacode.Dummy
import java.math.BigDecimal

fun main(args: Array<String>) {

    val names = arrayOf("Raj", "Rohan", "Romeo")
    val longArray1 = arrayOf(1L, 2L, 3L)
    val longArray2 = arrayOf<Long>(1,2,3,4)
    val longArray3 = arrayOf(1,2,3,4)

    println(longArray1 is Array<Long>)
    println(longArray2 is Array<Long>)
    println(longArray3 is Array<Int>)

    println(longArray1[2])

    val evenNumbers = Array(16) {i -> (i + 2) /2}

    for (number in evenNumbers)
        println(number)

    val lotsNumbers = Array(100000) {i -> i+1}
    val allZeroes = Array(100){0}

    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4)

    for (number in someArray)
        println(number)

    someArray = Array(6) { i -> (i+1) * 10}

    for (number in someArray)
        println(number)

    println("Mixed array \n")

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')

    for (element in mixedArray)
        println(element)

    println(mixedArray is Array<*>)

    val myIntArray = intArrayOf(3,9,475,338)
    Dummy().printNumbers(myIntArray)

    var someotherArray = IntArray(5)  // initialized with default value

    someotherArray.forEach {
        println(it)
    }

    Dummy().printNumbers(evenNumbers.toIntArray())
}