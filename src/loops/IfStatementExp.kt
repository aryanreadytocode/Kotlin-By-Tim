package loops
/*  -- ternary operator not there in Kotlin as if can act as ternary operator
*   --
* */
fun main() {
    val someCondtion = 69 < 22


    val num2 = if (someCondtion) {
        println("something")
        50
    }else {
        println("something else")
        592
    }

    println(num2)


}