package com.example.kotlinlang


// loops and functions in kotlin

fun showMsg(first: Int , second: Int ,msg:String ): Int {

    var i :Int = 123

    for(i in first..second)
    {
        println("msg is $msg at index $i")
    }
    return i
}
fun main()
{

    println(showMsg(1,100,"Hello"))
















    // if and statements in Kotlin
   /* var num = 10


    if(num>=1000)
    {
        println("Good")
    }
    else
    {
        println("Bad")
    }


    val amount = 1222

    when (amount)
    {
        in 10..1000 -> println("Good Number")
        !in 10..1234 -> println("Not included")
        1234 -> println("Nice approach")
        else ->
        {
            println("Out of Bound")
        }

    }*/






    /*// var mutable
    // val immutable


    val  num0: Byte = 123 // Byte 8 bits

    println(num0)

    var  num1: Short = 123 // Short 16 bits
    num1 = 23676
    println(num1)

    var  num2: Int = 123 // Int 32 bits
    num2 = 23676754
    println(num2)

    var  num3: Long = 123 // Long 64 bits
    num3 = 2367675409807855346
    println(num3)


    val num4: Float = 2.231213424423423f
    println(num4)

    val num5 = 2.2312134345324
    println(num5)

    val str: String = "Hello"
    println(str)*/






}