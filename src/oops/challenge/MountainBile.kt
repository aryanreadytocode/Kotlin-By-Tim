package oops.challenge

class MountainBike(var seatHeight: Int, cadence: Int, speed: Int,gear: Int = 5): Bicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches")
    }

    companion object {
        val listOfColors = listOf("blue", "red", "white", "yellow", "green")
    }

}