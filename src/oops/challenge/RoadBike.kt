package oops.challenge

class RoadBike(private val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 7): Bicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM")
    }
}