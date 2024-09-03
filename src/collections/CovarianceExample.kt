package collections
/*
* immutable list is covariant but not mutable type of list
* contravariant
* covariant
* reified
*
* Use covariance when you want subtyping to be preserved in other words
* T will T and all it's subclasses
*
* Use contravariance when you want to match T and any of its superclasses
* */
fun main() {
//   val shortList: MutableList<Short> = mutableListOf(1,2,3,4,5)
//   convertToInt(shortList)

    val roseTender = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) = println("I'm pruning a rose!")
    }

    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), roseTender)
    roseGarden.tendFlower(0)
}

fun convertToInt(collection: MutableList<Number>) {
    for (num in collection)
        println("${num.toInt()}")
}

//fun tendGarden(roseGarden:Garden<Rose>) {
//    waterGarden(roseGarden)
//}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}
class Rose: Flower() {

}
/*this class is covariant(doesn't require exact type) meaning
* that we've used the out keyword*/
//class Garden<out T: Flower> {
//    val flowers: List<T> = listOf()

//    fun pickFlower(i: Int): T = flowers[i]
//    fun plantFlower(flower: T) {
//
//    }
//}

interface FlowerCare<T> {
    fun prune(flower: T)
}

class Garden<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}



