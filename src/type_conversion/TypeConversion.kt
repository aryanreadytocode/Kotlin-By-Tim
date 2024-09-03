package type_conversion

fun main(args: Array<String>) {
    println("259 to byte: "+(259.toByte()))
    println("50000 to short: "+(5000.toShort()))
    println("21474847499 to Int: "+(21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    // Char to Number is deprecated in kotlin
    println("A to Int: " + ('A'.toInt()))

    area(height = 10, widht = 20)
}

fun area(widht: Int, height: Int) {
    println("width = $widht and height = $height")
}