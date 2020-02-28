package com.muzi.startkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.solver.widgets.Rectangle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
        customLog("${maxOf(3,8)}")
        collectionsTest()
        UserInfo.age = 15
        customLog("${UserInfo.age} - ${UserInfo.name}")
    }

    fun functionParams(a: Int, b: Int): Int {
        println("sum of $a and $b is $(a+b)")
        return a + b
    }
    fun functionWithNoReturnValue(): Unit {
        println("no params, no return value")
    }

    fun functionSimple() {
        println("无返回值Unit可以省略")
    }

    fun customLog(s: String){
        println("MUZI12580: $s")
    }

    fun test() {
        val value1 = "我是常量，类型自动推断为String"
        val stringValue: String = "我是String常量"
        var value2 = "我是变量，类型自动推断"
/*
    这是注释
 */
        var hisAge = 1
        val s1 = "s1 is $hisAge"
        hisAge = 2
        val s2 = "${s1.replace("is","was")}, but now is $hisAge"
        println("MUZI12580: $s2")
    }

    fun maxOf(a: Int, b: Int): Int = if(a > b) a else b

    fun parseInt(str: String): Int? {
        return null
        //...
    }
    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        if (x != null && y != null){
            println(x * y)
        }else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return  obj.length
        }
        return null
    }
    fun getAnotherStringLength(obj: Any): Int? {
        if (obj !is String) return null
        return obj.length
    }
    fun getThirdStringLength(obj: Any): Int? {
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }

    fun arrayFunctionTest() {
        val items = listOf<String>("apple","banana","orange")
        for (item in items) {
            customLog(item)
        }
        for (index in items.indices) {
            customLog("item at $index is ${items[index]}")
        }
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }

    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "not is String"
            else -> "Unknow"
        }

    fun rangeTest() {
        val x = 10
        val y = 9
        if (x in 1..y+1) {
            customLog("fits in range")
        }
        val list  = listOf<String>("a","b","c")
        if (-1 !in 0..list.lastIndex) {
            customLog("-1 is out of range")
        }
        if (list.size !in list.indices) {
            customLog("list size is out of valid indices range, too")
        }
        for (x in 1..5) {
            customLog("$x")
        }
        for (x in 1..10 step 2) {
            customLog("step 2 rusult is $x")
        }
        for (x in 9 downTo 0 step 3) {
            customLog("downTo 0 step 3 result is $x")
        }
    }

    fun collectionsTest() {
        val items = listOf<String>("apple","orange","banala")
        for (item in items) {
            customLog("$item")
        }
        when {
            "orange" in items -> customLog("juicy")
            "apple" in items -> customLog("apple is fine too")
        }
        items
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach{customLog("$it")}
    }

    fun testClassCreate() {
        val rectangle = Rectangle()
    }
}
