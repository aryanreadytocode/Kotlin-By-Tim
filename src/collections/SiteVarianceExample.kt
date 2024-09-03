package collections

fun main() {
    val car1 = mutableListOf(Carr(), Carr())
    val car2: MutableList<Carr> = mutableListOf()
    copyCars(car1, car2 )

    val mahindra1 = mutableListOf(Mahindra(), Mahindra())
    val mahindra2: MutableList<Mahindra> = mutableListOf()
    copyCars(mahindra1, car2 )
}

fun <T> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    for(car in source)
        destination.add(car)
}

open class Carr {

}

class Toyota: Carr() {

}

class Mahindra: Carr() {

}