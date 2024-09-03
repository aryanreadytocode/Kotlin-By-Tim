package collections

/*
* covariant type >> out exmaple List
* if the clas is type of covariant it can use class and it's subclass type as param
*
* out can be used when type is being produced, not consumed
*
* if function doesn't define type you can use super
* List<? super Number>*/

fun main() {
    val admins: List<Administrator> = listOf()
    val normalUser: List<NormalUser> = listOf()
    val userList: List<Userr> = normalUser
}

open class Userr(val userType: Int)

class Administrator(val auth: String) : Userr(1)
class NormalUser(val auth: String) : Userr(2)

interface Person<out T> {
    fun something() : T
}
