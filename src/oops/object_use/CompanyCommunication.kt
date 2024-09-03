package oops.object_use

import oops.SomeClass
import java.time.Year
/*/Singleton class
* can be created using object keyword*/
fun main() {
    println(CompanyCommunication.getTagLine())
    println(CompanyCommunication.getCopyrightLine())

    println(SomeClass.accessPrivateVar())

    val someClas1 = SomeClass.justAssign("this is the string as it is")
    val someClas2 = SomeClass.upperOrLowerCase("this is the string as it is", false)

    println(someClas1.someString)
    println(someClas2.someString)
}



object CompanyCommunication {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks"
    internal fun getCopyrightLine() = "Copyright \u000A9 $currentYear Our  Company. All rights reserved"
}