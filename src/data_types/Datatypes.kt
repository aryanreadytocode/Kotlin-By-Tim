package data_types

import data_types.javacode.Dummy

fun main(args: Array<String>) {
    var myInt = 35
    // add suffix L for long integer
    var myLong = 23L

    println("My integer ${myInt}")
    println("My long integer ${myLong}")

    var b1: Byte = Byte.MIN_VALUE;
    var b2: Byte = Byte.MAX_VALUE;
    println("Smallest byte value: "+b1)
    println("Largest byte value: "+b2)

    var S1: Short = Short.MIN_VALUE
    var S2: Short = Short.MAX_VALUE
    println("Smallest short value: "+S1)
    println("Largest short value "+S2)

    var I1:Int = Int.MIN_VALUE
    var I2:Int = Int.MAX_VALUE
    println("Smallest integer value: "+I1)
    println("Largest integer value: "+I2)

    var L1: Long = Long.MIN_VALUE
    var L2: Long = Long.MAX_VALUE
    println("Smallest long integer value: "+L1)
    println("Largest long integer value: "+L2)

    val intVal = 10
    var longVal = 2L

    longVal = intVal.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val anotherInt = 5

    var myDouble = 65.984
    println(myDouble is Double)

    val myFloat = 838.8492f
    println("This is a float: ${myFloat is Float}")

    val vacationTime = false
    val onVacation = Dummy().isVacationTime(vacationTime)
    println(onVacation)


    val anything: Any
}