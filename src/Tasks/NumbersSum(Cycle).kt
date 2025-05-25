package Tasks

fun main() {
    val enterNumber = readln().toInt()
    var nums = 1;
    var sum = 0;
    repeat(enterNumber) {
        sum += nums;
        nums++
    }
    println("Сумма чисел от 1 до $enterNumber равна $sum");
    //вариант без цикла:
    println("Сумма чисел от 1 до $enterNumber равна ${(1..enterNumber).sum()}"); // чуть медленне, чем цикл, т.к. под капотом доп. проверка на переполнение
}