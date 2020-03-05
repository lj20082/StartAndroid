/*
 * *
 *  * Created by Li.jianzhong on 3/5/20 4:45 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 3/5/20 4:45 PM
 *
 */

package com.muzi.startkotlin

class LogHelper {
    companion object{}
    fun logInfo(info: Any){
        println("Result: $info")
    }
}

fun LogHelper.Companion.log(info: Any) {
    kotlin.io.println("Result: $info")
}