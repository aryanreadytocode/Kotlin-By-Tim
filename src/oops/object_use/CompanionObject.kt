package oops
/*object can be used
* for companion object
* function, variable inside companion object is treated as static in Kotlin
* You can function and variable using class name directly
* this is the second use case of 'object'*/
class SomeClass private constructor(val someString: String) {

    companion object {
        private val privateVar = 6

        fun accessPrivateVar() = "I am accessing privateVar: $privateVar"


        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, lowercase: Boolean): SomeClass {
            return if (lowercase) {
                SomeClass(str.toLowerCase())
            } else {
                SomeClass(str.toUpperCase())
            }
        }
    }
}