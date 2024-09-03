package io

import java.io.File

fun main() {
//    val lines = File("testfile.txt").reader().readLines()
//    lines.forEach { println(it) }

    /*val reader = File("testfile.txt").reader()
    val lines = reader.readText();
    println(lines)*/

    /*val lines = File("testfile.txt").reader().use {it.readText()}
    println(lines)*/

    /*val lines = File("testfile.txt").bufferedReader().use {it.readText()}
    println(lines)*/

    /*val lines = File("testfile.txt").readText()
    println(lines)*/

   /* File("testfile.txt").reader().forEachLine { println(it) }*/

    File("testfile.txt").reader().useLines { it.forEach { println(it) } }
}