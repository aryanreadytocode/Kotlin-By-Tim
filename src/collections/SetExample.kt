package collections

fun main() {
    val setInts = setOf(10,15,20,25,30)
    println(setInts.plus(0))
    println(setInts.plus(10))
    println(setInts.minus(10))
    println("minus 100 ${setInts.minus(100)}")
    println("average ${setInts.average()}")
    println("drop 3 ${setInts.drop(3)}")

    println("mutable list >>>")
    val mutableInts = mutableSetOf(1,2,3,4,5)
    mutableInts.plus(10)
    println(mutableInts)

    println("filter ${setInts.filter { it % 2 != 0}}")

    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )

    println("filter for immutable ${immutableMap.filter {it.value.year == 2016}}")

    val mutableMap = mutableMapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    println("filter for mutable ${mutableMap.filter { it.value.color == "silver"}}")

    val ints = arrayOf(1,2,3,4,5)
//    val add10List: MutableList<Int> = mutableListOf()
//    for(i in ints) {
//        add10List.add(i+10)
//    }
//    println(add10List)
    val add10List = ints.map {it + 10}
    println(add10List)

    println(immutableMap.map { it.value.year })

    println(mutableMap.filter {it.value.model == "Ford"}
        .map {it.value.color})

//    println(mutableMap.any {it.value.year > 2014})

    println(mutableMap.count {it.value.year > 2014})

    val cars = mutableMap.values
    println(cars.find {it.year > 2014})

    println(cars.groupBy {it.color})

    println(immutableMap.toSortedMap())

    println(cars.sortedBy {it.year})
}
