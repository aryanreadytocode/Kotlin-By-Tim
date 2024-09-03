package oops.imports_in_kotlin.anotherpackage

import oops.enum.Department.*
import oops.upperFirstAndLast as ufal
import oops.imports_in_kotlin.otherpackage.topLevel as tp
import oops.object_use.CompanyCommunication as comm

fun main() {
    tp("Hello from another file")
    println(comm.getCopyrightLine())
    println(IT.getDepartmentInfo())
    println(SALES.getDepartmentInfo())

    println("a string to work with".ufal())
}