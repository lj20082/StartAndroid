/*
 * *
 *  * Created by Li.jianzhong on 2/28/20 5:22 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 2/28/20 5:22 PM
 *
 */

package com.muzi.startkotlin

import androidx.constraintlayout.solver.widgets.Rectangle

class Invoice {}
class Empty
class User constructor(firstName: String){}
class Boy(firstName: String){}

class InitOrderDemo(name: String) {
    val customerKey = name.toUpperCase()
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    var secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }

}

class Worker(val firstName: String,var age: Int) {}
class MyCustomer public constructor(name: String) {}

class Father {
    var children: MutableList<Father> = mutableListOf<Father>()
    constructor(father: Father) {
        father.children.add(this)
    }
}

open class Base(p: Int)
class Derived(p: Int) : Base(p)

open class Shape {
    open fun draw() {}
    open val vertexCount: Int = 0
    val borderColor: String get() = "black"
    fun fill() {}
}

class Circle() : Shape() {
    override val vertexCount: Int = 4
    override fun draw() {
        super.draw()
    }
    val fillColor: String get() = super.borderColor
}

class FilledRectangle: Rectangle() {
    open fun draw(){}
    val borderColor: String get() = "black"
    inner class Filler {
        fun fill(){}
        fun drawAndFill(){
//          super@FilledRectangle.draw()
            fill()
            println("hello world")
        }
    }
}

open class TempRectangle {
    open fun draw(){}
}
interface Polygon {
    fun draw(){}
}
class TempSquare() : TempRectangle(), Polygon {
    override fun draw() {
        super<Polygon>.draw()
        super<TempRectangle>.draw()
    }
}

abstract class TempRectangleTwo : Polygon {
    override abstract fun draw()
}