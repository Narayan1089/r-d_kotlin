package com.example.myapplication.practise

fun main() {
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println(sum(3, 5)) // Output: 8

    val sup: (Int) -> Int = { it}
}


