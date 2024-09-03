package oops

data class Car(val color: String, val model: String, val year: Int) {
    override fun toString(): String {
        return "Car.kt Color: $color, with Model $model launched in year $year"
    }
}

fun main() {
    val car1 = Car("Black", "Mahindra That Roxx", 2024)
    println(car1.toString())

    val car2 = Car("Black", "Mahindra That Roxx", 2024)

    val car3 = car1.copy()
    println(car3)

    val car4 = car1.copy()

    println(car1 == car2)
    val car5 = car1.copy(year = 2016)
    println(car5.year)
}