package Tasks

import kotlin.math.pow
/**
 * Напишите программу, которая переводит значение терабайт (Тб), введенное пользователем, в байты.
 * 1 Кб (килобайт) = 1024 байта
 * 1 Мб (мегабайт) = 1024 Кб
 * 1 Гб (гигабайт) = 1024 Мб
 * 1 Тб (терабайт) = 1024 Гб
 */
fun main() {
    val terabyte = readln().toLong();
    val byteUnity = 1024.0;
    val terabyteToByte = terabyte * byteUnity.pow(4).toLong()
    println(terabyteToByte);

}