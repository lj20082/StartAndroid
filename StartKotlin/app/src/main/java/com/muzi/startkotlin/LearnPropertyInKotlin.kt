/*
 * *
 *  * Created by Li.jianzhong on 3/5/20 10:04 AM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 3/5/20 10:04 AM
 *
 */

package com.muzi.startkotlin

const val SUBSYSTEM: String = "Hello world"

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String ="123456"
    var size = 0

    var allByDafault: Int? = 1
    val isEmpty: Boolean
        get() = this.size == 0
    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            println(value)
        }
    val isOk get() = this.size == 0

    var setterVisibility: String = "abc"
        private set
    var setterWithAnnotation: Any? = null

    var counter = 0
        set(value) {
            if (value >= 0) field = value
        }
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    return result
}

interface MyInterface {
    val prop: Int //抽象的

    val propertyWithImplementation: String
        get() = "foo"

    fun bar()
    fun foo() {
        //可选的方法体
        println(prop)
    }
}

class Child: MyInterface {
    override val prop: Int
        get() = 12
    override val propertyWithImplementation: String
        get() = super.propertyWithImplementation + "1234"
    override fun bar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun foo() {
        super.foo()
    }
}


interface Named {
    val name: String
}

interface PersonA: Named {
    val firstName: String
    val lastName: String
    override val name: String
        get() = "$firstName $lastName"
}

interface A {
    fun foo() {
        println("A")
    }
    fun bar()
}
interface B {
    fun foo() {
        println("B")
    }
    fun bar() {
        println("bar")
    }
}
class C: A {
    override fun bar() {
        println("bar")
    }
}
class D : A,B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4
    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass: Outer() {
    override val b = 5
    fun test() {
        val list = mutableListOf<Int>(1,2,3)
        list.swip(0,2)
    }
}

fun <T> MutableList<T>.swip(index1: Int,index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

