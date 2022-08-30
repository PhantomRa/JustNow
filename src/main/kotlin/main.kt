package ru.netology

import kotlin.math.abs

fun main() {
    val seconds = 60*54

    println("был(а) ${timeToText.agoToText(abs(seconds))}.")
}