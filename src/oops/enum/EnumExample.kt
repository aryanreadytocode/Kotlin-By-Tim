package oops.enum

enum class Department(val fullName: String, val numEmployee: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3), SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName department has $numEmployee employees"
}

fun main() {
    Department.ACCOUNTING.getDepartmentInfo()
}