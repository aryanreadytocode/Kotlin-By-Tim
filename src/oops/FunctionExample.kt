package oops

fun main() {
    println(labelMultiply(5,10, ))

    val emp = Employee1("Raju")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "toyota", 2015)
    val car3 = Car("black", "Ford", 2018)
    val car2 = Car("red", "Tata", 2020)

    printColors(car1, car2)

    val manyCars = arrayOf(car1, car2, car3)
    // spread operator *
    // the spread operator unpack the array and pass the individual argumens
    //
    printColors(*manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)

    lotsOfCars.forEach { println(it) }
}

fun labelMultiply(operand1: Int, operand2: Int, lable: String = "The answer is:") : String {
    return ("$lable ${operand1 * operand2}")
}

fun labelMultiply2(operand1: Int, operand2: Int, lable: String) : String = "$lable ${operand1 * operand2}"

fun labelMultiply3(operand1: Int, operand2: Int, lable: String)  = "$lable ${operand1 * operand2}"


class Employee1(private val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase();
}

/*varargs*/

data class Car1(val color: String, val model: String, val year: Int) {

}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}