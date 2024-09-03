package collections

fun main() {
    val seasons = listOf("spring", "summer", "fall", "winter")
    println(seasons.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    if (!emptyList.isEmpty())
        println(emptyList[0])

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList.javaClass)

    val mutableList = mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass)

    val array = arrayOf("black", "red", "while")
    val colorList = array.toList()
    println(colorList)

    println(seasons.last())

    println(seasons.asReversed())

    println(seasons.getOrNull(5))

    val  ints = listOf(1,2,3,4)
    println(ints.max())

    println(colorList.zip(seasons))

    val mergedLists = listOf(colorList, seasons)
    println(mergedLists)

    val combinedList = colorList + seasons
    println(combinedList)

    val duplicateList = seasons + "winter"
    println(duplicateList)
    // no duplicate list using union
    val noDupsList = colorList.union(duplicateList)
    println(noDupsList)

    val noDups = seasons.distinct();
    println(noDups)

    // change mutable to immutable list
    val mutableSeason = seasons.toMutableList()
    mutableSeason.add("other season")
    println(mutableSeason)

}