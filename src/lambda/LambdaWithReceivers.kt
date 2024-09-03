package lambda

fun main() {

    val employees = listOf(Employee("Raj", "Aryan", 2021),
        Employee("Anu", "Kumar", 2022),
        Employee("Sunny", "Kumar", 2023),
        Employee("Raushan", "Kumar", 2024))

    findByLastName(employees, "Kumar")
    findByLastName(employees, "Yadav")


    "Some String".apply outerBlock@{
        "Another String".apply {
            println(toLowerCase())
            println(this@outerBlock.toUpperCase())
        }
    }
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for(i in 1..99) {
        numbers.append(i)
        numbers.append("' ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countTo100UsingWith() =
     with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
     }

/**/
fun countTo100UsingApply() =
    StringBuilder().apply {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@{
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return@returnBlock
        }
    }
    println("Nope, there's no employee with the last name $lastName")
}