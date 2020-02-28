/*
 * *
 *  * Created by Li.jianzhong on 2/28/20 4:02 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 2/28/20 4:01 PM
 *
 */

package com.muzi.startkotlin

import android.app.DownloadManager

class ControlTestDemo {

    fun ifTest(a: Int, b: Int) {
        val max = if (a > b) {
            println("Choose a")
            a
        } else {
            println("choose b")
            b
        }
    }

    fun whenTest(x: Any) {
        when (x) {
            1 -> println("x == 1")
            2 -> println("x == 2")
            else -> {
                println("x is neither 1 nor 2")
            }
        }
        when (x) {
            0,1 -> println("x == 0 or x == 1")
            else -> println("otherwise")
        }
        when (x) {
            in 1..10 -> println("x is in the range")
            !in 10..20 -> println("x is outside the range")
            else -> println("none of the above")
        }
    }

    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }


    fun forTest() {
        val collection = arrayListOf(1,2,3,4,5)
        for (item in collection) println(item)
        for (i in 1..3) {
            println(i)
        }
        for (i in 6 downTo 0 step 2) {
            println(i)
        }
        for (i in collection.indices) {
            println(collection[i])
        }
        for ((index, value) in collection.withIndex()) {
            println("the element at $index is $value")
        }
    }

    fun whileTest() {
        var x = 100
        var y: String? = "helloworld"
        while (x > 0) {
            x--
        }

        do {
            y = null
        } while (y != null)
    }

    fun returnTest() {
        var person = Person()
        val s = person.name ?: return

        loop@ for (i in 1..100) {
            println(i)
            for (j in 1..100) {
                if (i+j == 100) break@loop
            }
        }
    }

    fun foo() {
        listOf(1,2,3,4,5).forEach lit@{
            if (it == 3) return@lit
            println(it)
        }
        println("helloworld")

        listOf(1,2,3,4,5).forEach {
            if (it == 3) return@forEach
        }
        println("helloworld2")

        listOf(1,2,3,4,5).forEach(fun(value: Int) {
            if (value == 3) return
            println(value)
        })
        println("helloworld3")
    }

    fun breakTest() {
        run loop@{
            listOf(1,2,3,4,5).forEach{
                if (it == 3) return@loop
                println(it)
            }
        }
        println("done with nested loop")
    }

    fun continueTest() {

    }
}

class Person {
    var name: String? = "zhangsan"
}