package com.sample.alphanumericgenerator

import java.security.SecureRandom

val s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
val ss = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz,.;[]-=!@#$%^&*()_+{}:<>?"
private val rnd = SecureRandom()


fun randomGenerator(len:Int): String {
        val sb = StringBuilder(len)
        for (i in 0 until len)
            sb.append(s[rnd.nextInt(s.length)])
        return sb.toString()
}

fun randomSpecialGenerator(len:Int):String{
    val sb = StringBuilder(len)
    for (i in 0 until len)
        sb.append(ss[rnd.nextInt(ss.length)])
    return sb.toString()
}
