package Tasks

fun main() {
    print("Введите мощность двигателя, л.с.: ");
    val power = readln().toInt();
    val rate: Int;

    if (power <= 100) {
        rate = 10;
    } else if (power <= 150) {
        rate = 34;
    } else if (power <= 200) {
        rate = 49;
    } else if (power <= 250) {
        rate = 75;
    } else {
        rate = 150;
    }
    val tax = power * rate;

    println("Вид ТС: легковой автомобиль \nМощность двигателя: $power л.с. \nНалоговая ставка: $rate руб./л.с. \nСумма налога: $tax руб.");

}