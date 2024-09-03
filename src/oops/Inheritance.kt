package oops
// by default any class is final and public in kotlin

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice() : Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    override fun printModel() = println("The model of this laer printer is $modelName")

    override fun bestSellingPrice(): Double = 12_999.00
}

class SuperLaserPrinter(modelName: String) : LaserPrinter(modelName, ppm = 10) {

}

fun main() {
    val laserPrinter = LaserPrinter("Nikon 546", 15)
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())

    SomethingElse("whatever")
}


open class Something: MySubInterface {
    override val number: Int = 25

    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String) : super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

data class DataClass(val number: Int) {

}


interface MyInterface {
    val number: Int
    val number2 : Int get() = number * 10
    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}