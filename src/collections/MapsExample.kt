package collections


fun main() {
    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )
    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = hashMapOf<String, Car>("Raj\'s Car.kt" to Car("red", "Range Rover", 2010),
    "Anu\'s car" to Car("blue", "Hyundai", 2012))
    println(mutableMap.javaClass)
    println(mutableMap)

    mutableMap.put("Sonu\'s car", Car("red", "Corvette", 1965))

    val pair = Pair(10, "ten")
//    val firstValue = pair.first
//    val secondValue = pair.second
    val (firstValue, secondValue) = pair
    println("firstValue: $firstValue, secondValue: $secondValue")

    for ((key, value) in mutableMap) {
        println("key: ${key}, value: ${value}")
    }

    var car = Car("blue", "Corvette", 1959)
    var (color, model, year) = car
    println("color = $color, model = $model, year: $year")

}

data class Car(val color: String, val model: String, val year: Int)  {
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
}