package loops

fun main() {
//    println(getNumber("22.5")?: throw IllegalArgumentException("Number isn't an Int"))
//    println(getNumber("22.5")?: "I can't print the result")

    notImplementedYet("raj")

}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    }catch (e: java.lang.NumberFormatException) {
        null
    }finally {
        println("I'm in finally block")
    }
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}