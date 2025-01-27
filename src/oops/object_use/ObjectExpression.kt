package oops.object_use

/*The third use of object is Object expression*/

fun main() {

    var thisIsMutable = 45

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++;
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println(thisIsMutable)
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")

}

