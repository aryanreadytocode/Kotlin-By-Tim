package interoperability

fun main() {
    val car = Car("red","Swift Desire vxi",  2021)
    car.color = null
    println(car)

    var model: String? = car.model
    println(model?.javaClass)
    model = null
    println(model)

}