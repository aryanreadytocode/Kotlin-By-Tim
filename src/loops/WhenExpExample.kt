package loops

import java.math.BigDecimal

/*
* -- equivalent to switch statement
* */
fun main() {
    val num = 100

    when(num) {
        in 100..199 -> println("in range 100..199")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't matches anything")
    }

    val y = 10

    when(num) {
        y + 80 -> {
            println("90")
            1
        }
        y + 90 -> {
            println("100")
            2
        }
        300 -> {
            println("300")
            3
        }
        else -> println("Doesn't match anything")
    }

    val obj: Any = "I'm a string"
    val obj1: Any = BigDecimal(25.2)
    val obj2: Any = 45

    val something: Any =obj1
//    if (something is String)
//        println(something.toUpperCase())
//    else if (something is BigDecimal)
//        println(something.remainder(BigDecimal(10.5)))
//    else if (something is Int)
//        println("${something - 22}")

    val z = when(something) {
        is String -> {
            println(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> 10
    }

    println(z)

    val timeOfYear = Season.WINTER

    val str = when(timeOfYear) {
        Season.SPRING -> "Flower are blooming"
        Season.SUMMER -> "It's hot"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> "I need a coat"
    }

    println(str)

    val rahulAge = 32
    val chhotuAge = 33

    when {
        rahulAge > chhotuAge -> println("Rahul is elder than Chhotu")
        rahulAge < chhotuAge -> println("Rahul is younger than Chhotu")
        else -> println("Rahul == Chhotu")
    }
}

enum class Season {
    WINTER, SUMMER, FALL, SPRING
}