package oops.challenge

open class Bicycle( var cadence: Int, var speed: Int, var gear: Int = 3) {

    constructor(color: String, cadence: Int, speed: Int, gear: Int = 3):this(cadence, speed, gear) {
        println("This is the $color")
    }

    fun applyBrake(decrement: Int) { speed -= decrement }
    fun speedUp(increment: Int) { speed += increment }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

