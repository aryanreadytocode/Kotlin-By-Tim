package collections
/*
* contravariant type >> in example Comparable
* if the clas is type of contravariant it can use class and it's superclass type as param
*
* in can be used when type is being consumed, not produced
* if function doesn't defined type you can use extends
* List<? extend Number>*/
fun main() {

//    val userComparator : Comparable<User> = adminComparator
    val adminComparator : Comparable<Administrator> = userComparator
}

val userComparator: Comparable<Userr> =
    object : Comparable<Userr> {
        override fun compareTo(other: Userr): Int {
            return 1
        }
    }

val adminComparator: Comparable<Administrator> =
    object : Comparable<Administrator> {
        override fun compareTo(other: Administrator): Int {
            return 1
        }
    }

interface Person1<in T> {
    fun doSomething(e: T)
}