package variables
/*
* always try to use val
* if you have the reason to change then use var*/


/*
* Type Alias:
*   -- Imagine you are creating a project where you defined two classes with same name but different packages and
*      you have to use them at once. Generally, you need to use whole package dot class name format for the seccond one.
*      For example we have class named 'courses' one in 'com.aryan.apps'  another in 'com.raj_aryan.apps' we can use
*      one out of them using simple import and if we want to use second one we have to use full package name like'com.raj_aryan.apps.courses'
*   -- In Kotlin, we have solution for this named as Type aliases. It provides an alternative name for the existing types.
* */

/*
  Important Points:
* -- Kotlin doesn't need semicolon(;) at ends of line
* -- Kotlin does have wrapper for most commonly used java method like System.out.print() to print() internally it calling System.out.print
* -- In Kotlin, you don't have to declare a method can throw checked exception, throw keyword doesn't exist in kotlin
* -- ITernary operator does not exist in Kotlin
* -- To access element from collection you can simply use [index] to access element.
* -- Kotlin has it's own String class, in java length() is method but in kotin it's property length
* -- For loop doesn't exist in kotlin 'for(int i = 0; i< n; i++)'
* -- Kotlin doesn't have static key, concept is still there
* -- Kotlin doesn't have new operator.
* -- In Kotlin == operator used content comparison (equivalent ot java equals()) and === used for reference comparison.
* -- In Kotlin for bitwise operation there is no symbol like '&&, ||' instead you can use or, and, not, xor etc
*/


// here we define a type alias named LoginDetails
// which will take two strings as parameter
typealias LoginDetails = Pair<String, String>
fun main(args: Array<String>) {
    println("== and === in kotlin \n")

    val empOne = Employee("Raj", 1)
    val empTwo = Employee("Aryan", 2)
    val empThree = Employee("Aryan", 2)
    val empFour = empTwo

    println(empTwo === empOne)
    println(empTwo === empThree)
    println(empOne == empTwo)
    println(empTwo==(empThree))
    println(empTwo === empFour)

    println(empFour != empTwo)
    println(empFour !== empTwo)
    println(empTwo != empThree)
    println(empTwo !== empThree)

    // bitwise operator
    println("Bitwise operator\n")

    val x = 0x00101101
    val y = 0x11011011
    x and y
    x or y

    // type casting
    println("type casting\n")

    val something: Any = empFour
    if (something is Employee) {
        //val newEmp = something as Employee
        println(something.name)
    }

    // String template
    println("String template\n")
    println(empFour)

    val change = 4.22
    println("Your change is $change")

    val numerator = 10.99
    val denominator = 20.99
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    println("Triple quoted or raw string \n")
    val nurseryRhyme = """ Jonny Jonny !!
                            *Yes Papa
                            *Easting Sugar?
                            *No Papa
                            *Open your Mouth
                            *Haha""".trimMargin("*")
    println(nurseryRhyme)

    val number:Int
    number = 10

    val emp1 =  Employee("Raj", 100)
    emp1.name = "Raj Aryan"

    val emp2: Employee
    val number2 = 100
    if (number < number2)
        emp2 = Employee("Raja Ram", 400)
    else
        emp2 = Employee("Shyam", 200)

    // we are setting two users but we don't
    // have to define Pair each time while using it
    val my_details = LoginDetails("us1", "pwd1")
    // instead we can directly use our type alias Credentials
    val my_details2 = LoginDetails("us2", "pwd2")

}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?) : Boolean {
        if(other is Employee)
            return name == other.name && id == other.id
        return false
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }


}


