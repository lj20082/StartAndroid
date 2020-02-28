package com.muzi.startkotlin

import androidx.constraintlayout.solver.widgets.Rectangle
import java.io.File
import java.lang.ArithmeticException
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException
import java.math.BigDecimal
import java.nio.file.Files
import java.nio.file.Paths

class Customer {

    fun commonActionTest() {
        val list = listOf<Int>(1,-100,12,-20,5)
        val positivies = list.filter { x -> x > 0 }
        val positivies2 = list.filter { it > 0 }

        val emailList = listOf<String>("673@qq.com","hello@163.com")
        if ("673@qq.com" in emailList) {
            println("673@qq.com is in emailList")
        }
        if ("lee@126.com" !in emailList) {
            println("lee@126.com is not in emailList")
        }
        println("Name ${emailList.first()}")

        val map = mapOf("a" to 1,"b" to 2,"c" to 3)
        for ((k,v) in map) {
            println("$k -> $v")
        }
        println(map["a"])

        val p: String by lazy {
            return@lazy "helloworld"
        }

        "helloworld".spaceToCamelCase()

        val email = emailList.first() ?: throw IllegalStateException("Email is missing")
        print(map["3"] ?: "empty")

        val myTurtle = Turtle()
        with(myTurtle) {
            penDown()
            for (i in 1..4) {
                forward(100.0)
                turn(90.0)
            }
            penUp()
        }

        val stream = Files.newInputStream(Paths.get("/some/file.txt"))
        stream.buffered().reader().use { reader ->
            println(reader.readText())
        }
    }

    fun String.spaceToCamelCase() {
        println(123)
    }

    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }
    fun anotherTransform(color: String): Int = when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }

    fun testTryCache() {
        val result = try {
            println("do something")
        } catch (e: ArithmeticException) {
            throw  IllegalStateException(e)
        }
    }

    fun foo(param: Int) {
        var result = if (param == 1) {
            "one"
        } else if (param == 2) {
            "two"
        } else {
            "three"
        }
    }

    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }
    fun theAnswer() = 42

    fun testSwip() {
        val b: Boolean? = null

        var first = 1
        var second = 2
        first = second.also { second = first }
        println(first)
        println(second)
    }

    fun calcTaxes(): BigDecimal = TODO("waiting for feedback from accounting")
}

object Resource {
    var name = "name"
}

data class Student(val name: String, val email: String)

fun foo(a: Int = 0, b: String = "") {}

class Turtle {
    fun penDown(){}
    fun penUp(){}
    fun turn(degress: Double){}
    fun forward(pixels: Double){}
}