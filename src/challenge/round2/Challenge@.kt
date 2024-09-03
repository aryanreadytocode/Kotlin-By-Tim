package challenge.round2

fun main(args: Array<String>) {
    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384

    val float1 = -3847.384f
    val float2: Float = -3847.384f
    val float3 = -3847.384.toFloat()

    //2. Now change both of those variable declarations into nullable variables.

    val float4 : Float? = float1

    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign in the values 1,2,3,4 and 5
    val shortArrays = shortArrayOf(1,2,3,4,5)

    //4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25,  30 ...etc, all the way up to 200

    val intArray = Array(40){i -> (i+1)*5}

    val intArray2 = Array<Int?>(40){i -> (i+1) * 5 }

    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'

    val arr = arrayOf('a','b','c','d')
    val arr2 = charArrayOf('a', 'b', 'c', 'd')
    printText(arr)

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.lowerCase() when x isn't null,
    // and the string "I give up!" when x is null.

    val value = x?.toLowerCase()?:"I give up!"

    // 7. Now use the let functio to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    x?.let { println(it.lowercase().replace("am", "am not")) }
}



fun printText(arr: Array<Char>) {
    arr.forEach {
        println(it)
    }
}