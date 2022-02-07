package ru.netology

fun main() {
    val discountStart = 1001
    val discountNext = 10001
    val percent = 5.00/100
    val percentMeloman = 1.00/100
    val discount = 100
    val itemPrice = 100
    val itemCount = 120
    val melomans = true

    val totalPrice = itemPrice * itemCount
    val percentDiscount = totalPrice * percent
    val result = if (totalPrice>discountStart && totalPrice<discountNext) totalPrice - discount
    else  if (totalPrice>discountNext) totalPrice-percentDiscount
    else totalPrice


    println("Total Price: $result")
}