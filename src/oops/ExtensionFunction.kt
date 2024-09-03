package oops

fun main() {

    println(Utils().upperFirstAndLast("this is all in lowercase"))
}

fun String.upperFirstAndLast() : String {
    val upperFirst = substring(0,1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length-1)+
            upperFirst.substring(upperFirst.length-1, upperFirst.length).toUpperCase()
}