package io

import java.io.DataInputStream
import java.io.EOFException
import java.io.File
import java.io.FileInputStream

fun main() {

    val di = DataInputStream(FileInputStream("testfile1.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    }catch(e: EOFException) {

    }

    /// walking down and up of a file

    File(".").walkTopDown()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }
}