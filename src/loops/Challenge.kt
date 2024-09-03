package loops

fun main() {

//    for (i in 5..5000 step 5)
//        println(i)

//    for (i in 0 downTo -500)
//        println(i)

    var i0 = 0
    var i1 = 1
    var i2: Int
    println(i0)
    println(i1)
    for (i in 1..13) {
        i2 = i0 + i1
        println(i2)
        i0 = i1;
        i1 = i2
    }


}