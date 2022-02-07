package ru.netology

fun main() {
    val discountStart = 1001
    val discountNext = 10001
    val percent = 5.00 / 100
    val percentMeloman = 1.00 / 100
    val discount = 100
    val itemPrice = 100
    val itemCount = 110
    val Melomans = true

    val totalPrice = itemPrice * itemCount
    val percentDiscount = totalPrice * percent
    val resultDiscount = (totalPrice - discount) * percentMeloman
    val resultPercentDiscount = (totalPrice - percentDiscount) * percentMeloman
    val result =
        if (totalPrice > discountStart && totalPrice < discountNext && Melomans) totalPrice - discount - resultDiscount
        else if (totalPrice > discountStart && totalPrice < discountNext && !Melomans) totalPrice - discount
        else if (totalPrice > discountNext && Melomans) totalPrice - percentDiscount - resultPercentDiscount
        else if (totalPrice > discountNext && !Melomans) totalPrice - percentDiscount
        else totalPrice

    println("Total Price: $result")

}