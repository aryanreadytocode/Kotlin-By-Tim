package oops
/*
* Access Modifier:
* 1. public> It is default modifier, if you don't declare any modifier it will be public, unlike java
*       a kotlin class can have multiple public class.
* 2. private>> In kotlin file class can have private, means that everything in same class can acess it
* 3. protected
* 4. internal > visible inside same module (package)
*
*
* Primary constructor
* defined with clas name
* class Employee constructor(firstName: String){}
*
* */


val MY_CONSTANT = 100
fun main() {
    val emp = Employee("Raj")
    println(emp.firstName)
    emp.fullTime = false

    println(MY_CONSTANT)

    val emp2 = Employee("Aryan")
    println(emp2.firstName)
    println(emp.fullTime)

    val emp3 = Employee("Raja", false)
    println(emp3.firstName)
    println(emp3.fullTime)
}

class Employee (val firstName: String,  fullTime: Boolean = true){

    var fullTime = fullTime
    get() {
        println("running the custom get")
        return field
    }
    set(value) {
        println("running the custom set")
        field = value
    }

    // one way of doing
    /*val firstName: String;

    init {
        this.firstName = firstName;
    }*/

    // other way

    /*var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }*/

}


// data class example

