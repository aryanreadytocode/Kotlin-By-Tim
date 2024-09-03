package null_references
/*
* Null Reference
* If any variable could be null, that variable need to defined as nullable
* val name: String? = null
*
* Safe access operator
* val address : String? = student.getAddress()
* val city : String? = address?.getCity()
*
*
* Elvis Operator
* val str2 = str? : "This is the default value
* if str not null then str2 will assign str value
* else the string after colon
* val city : String? = address?.getCity() ?: "Patna"
*
*
* Safe cast operator as?
* val intArr: Any = arrayOf(11,2,3,4,5)
* val element: String = intArr as? String
* you will not get class cast exception above
*
*
* non-null assertion (!!)
* If you're sure about the value could not be null, and if null get exception you can use non-null assertion operator
* val name : String = "Raj"
* val nameInUppercase = name!!.toUpperCase()
*
* let function
*
* val str: String? = "This isn't null"
* str?.let {printLN(it)}
*
*/
fun main(args: Array<String>) {
    val str: String? = null
    println("What happens when we do this ${str?.toUpperCase()}")

    val str2 = str ?: "This is  default value"
    println(str2)

    val intArr : Any = arrayOf(1, 2 , 3, 4)
    val ele = intArr as? String
//    val ele1:String = intArr as? String  >> this could lead to error
    println(ele?.toUpperCase())

    // non-null assertion
    val name: String? = "Raj"
    println(name!!.toUpperCase())

    // let function

    val str4: String? = "This isn't null"
    str?.let { printText(it) }

    // nullable arrays
    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts)
        println(i)

    println(nullableInts[2].toString())
}

fun printText(str: String) {
    println(str)
}