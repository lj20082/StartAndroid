/*
 * *
 *  * Created by Li.jianzhong on 2/28/20 3:19 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 2/28/20 3:17 PM
 *
 */

package com.muzi.startkotlin

import java.lang.reflect.Array

class BasicTypesDemo {
    val one = 1
    val threeBillion = 3_000_000_000
    val oneLong = 1L
    val oneByte: Byte = 1
    val pi = 3.14
    val e = 2.7182818284
    val eFloat = 2.7182818284f
    val creditSecurityNumber = 1234_5678_9012_2345L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101000

    fun test() {
        val a = 10000
        println(a === a)
        val boxedA: Int? = a
        var anotherBoxedA: Int? = a
        println(boxedA == anotherBoxedA)
        println(boxedA === anotherBoxedA)
    }

    fun convertTest() {
        val b = 20
        b.toByte()
        b.toChar()
        b.toDouble()
        b.toLong()
        b.toFloat()
    }

    fun checkChar(c: Char) {
        if (c == '1') {
            println(c)
        }
    }

    fun arrayTest() {
        val asc = Array(5) { i -> (i * i).toString() }
        asc.forEach { println(it) }

        val x: IntArray = intArrayOf(1,2,3)
        x[0] = x[1] + x[2]

        val arr = IntArray(5)
        val arr1 = IntArray(5) { 42 }
        var arr2 = IntArray(5) { it * 1 }
    }

    fun stringTest() {
        val s = "hello world"
        for (c in s) {
            println(c)
        }
        val s1 = "abc" + 1
        println(s + "def")

        val text = """
            |helloworld
            |1234567
            |多行文本文字
        """.trimMargin()
        println("$s1.length is ${s1.length}")

    }
}