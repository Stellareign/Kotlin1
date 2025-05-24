package lessons

import kotlin.random.Random

fun main() {
    val correctNum = Random.nextInt(100);
    var win = false;
    while (!win) {
        print("Введите число от 0 до 100: ")
        val number = readln().toInt();
        if (number < correctNum) {
            println("Ваше число меньше загаданного");
        } else if (number > correctNum) {
            println("Ваше число больше загаданного");
        } else {
            win = true;
            println("Вы угадали");
        }
    }
}