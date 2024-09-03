package loops

/*  -- In kotlin you can use traditional java for loop instead we can use ranges
    -- all the ranges used should be comparable
*
* */

fun main() {
    val range = 1..5
    val charRange = 'a'..'z'
    val charStepRange = charRange.step(2)
    val stringRange = "ABC".."XYZ"

    println(6 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val backRange = 5.downTo(1)
    println(4 in backRange)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = stepRange.reversed()

    for (i in range)
        println("range $i")

    for (i in stepRange)
        println("stepRange: $i")

    for (i in stepThree)
        println("stepThree: $i")

    for (i in reversedRange)
        println("reverseRange: $i")

    for (char in charRange)
        println("charRange: $char")

    for (char in charStepRange)
        println("charStepRange: $char")

    for(i in 1..5 step 2)
        println(i)

    for(i in 45 downTo 15 step 5)
        println(i)

    for (i in 1 until 10)
        println("until: $i")

    val name = "Raj Aryan"
    for (i in name)
        println(i)

    val seasons = arrayOf("Spring", "Summer","Winter", "Fall")
    for (season in seasons)
        println(season)

    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..20
    println(notASeason)

    val str = "Hello"
    println('e' in str)
    println('e' !in str)

    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }

    seasons.forEachIndexed {index, value -> println("$value is season number $index") }

    /*you can name loop
    * and use that name to break or continue*/
    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5.. 10) {
                println("k = $k")
                if (k == 7) {
                    break@jloop
                }
            }
        }
    }



}