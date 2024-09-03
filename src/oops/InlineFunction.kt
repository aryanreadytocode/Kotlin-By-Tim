package oops

/*
* inline function is basically used to save memory
* so if you function as params
* internally JVM will create instance of function and hence use some memory
* so to avoid this memory consumption inline keyword is introduced
*
* consider inline where lambda function has small body*/

fun main() {
    message { print("this is message") }
}

inline fun message(a: () -> Unit) {
    a.invoke()
}