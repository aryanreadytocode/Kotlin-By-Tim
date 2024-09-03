package lambda
/*for lambda
* you can use direct curly braces if that function accept single lambda param,
* or it is last in order
*
* If there is one parameter to the lambda we can use it*/
fun main() {
    run {
        println("I am in lambda")
    }

    val employees = listOf(Employee("Raj", "Aryan", 2021),
    Employee("Anu", "Kumar", 2022),
    Employee("Sunny", "Kumar", 2023),
    Employee("Raushan", "Kumar", 2024))

    println(employees.maxBy { it.startYear })

    var num = 10
    run {
        num += 50
        println(num)
    }

    run { useParameter(employees, 10) }
}

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}