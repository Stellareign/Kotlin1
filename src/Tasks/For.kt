package Tasks

import java.awt.List
import kotlin.random.Random

fun main() {
//    val numbers = List(10) { Random.nextInt(0, 10) } // генерация коллекции случайных чисел
    val numbers = (0..10).shuffled().take(10) // уникальные случайные числа
    println(numbers)
    for (num in numbers) {
        if (num % 2 == 0) {
            print("$num ")
        }
    }

}


