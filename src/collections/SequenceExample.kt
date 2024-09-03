package collections
/*
* while using function like map filter on collection
* it creates intermediate collection after operation
* which is not good if we have large size of collection
*
* Kotlin introduced Sequence pretty much similar to Java stream
* Java 8 is not supported on many platform like android
* so kotlin introduced Sequence
*
* Kotlin's collection is very powerful, we don't need to use Sequence
* until unless collection size is really huge, and it's going to
* create intermediate collection*/
fun main() {

    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    println(immutableMap.asSequence().filter {it.value.model == "Ford"}
        .map {it.value.color})

    listOf("Joe", "Mary", "Jane")
        .map { println("mapping $it"); it.toUpperCase()}
        .filter {println("filtaering $it"); it[0] == 'J'}
        .find {it.endsWith('E')}
}