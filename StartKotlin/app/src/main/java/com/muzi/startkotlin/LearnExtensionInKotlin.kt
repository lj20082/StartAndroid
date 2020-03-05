/*
 * *
 *  * Created by Li.jianzhong on 3/5/20 4:43 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 3/5/20 4:43 PM
 *
 */

package com.muzi.startkotlin

class Example {
    companion object {}
    fun printFunctionType() {
        LogHelper().logInfo("Class function")
    }
}
fun Example.printFunctionType(i: Int) {
    LogHelper().logInfo("Extension function")
}

fun Example.Companion.printCompanion() {
    LogHelper().logInfo("companion")
}

fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}

fun List<String>.getLongestString(){
    LogHelper.log("fetch longest string")
}

class Host(val hostname: String) {
    fun printHostname() {
        LogHelper.log(hostname)
    }
}
class Connection(val host: Host, val port: Int) {
    fun printPort() {
        LogHelper.log(port)
    }
    fun Host.printConnectionString() {
        printHostname()
        LogHelper.log(":")
        printPort()
        LogHelper.log(toString())
        LogHelper.log(this@Connection.toString())
    }
    fun connect() {
        host.printConnectionString()
    }
}

open class BaseObj{}
class Derived : Base {}
