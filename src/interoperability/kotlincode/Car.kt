@file:JvmName("StaticCar")

package interoperability.kotlincode

import java.io.IOException
import kotlin.jvm.Throws

fun topLevel() = println("I'm in the car file!")

object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doint something in the singleton object")
}

@Throws(IOException::class)fun doIO() {
    throw IOException()
}

class CarKt(val color: String, @JvmField val model: String, val year: Int) {
    companion object {
        const val constant = 10
        @JvmField val isAuto = false
        @JvmStatic fun carCamp() = println("I'm in Car's comp")
    }

    fun printMe(text: String) {
        println("I dont know $text")
    }


}

fun main() {
    "Print this".print()
    CarKt.carCamp()
}

fun String.print() {
    println(this)
}

@JvmOverloads fun defaultArg(str: String, num: Int = 25) {

}