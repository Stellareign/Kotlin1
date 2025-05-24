package Tasks

fun main() {
    print("ТС грузовое? true / false ");
    val isTruck = readln().toBoolean();

    val carType = if (isTruck) {
        "грузовой автомобиль";
    } else {
        "легковой автомобиль";
    }
    print("Введите мощность двигателя, л.с.: ");
    val power = readln().toInt();
    val rate: Int;

    if (power <= 100) {
        if (isTruck) {
            rate = 25
        } else {
            rate = 10;
        }
    } else if (power <= 150) {
        if (isTruck) {
            rate = 40;
        } else {
            rate = 34;
        }
    } else if (power <= 200) {
        if (isTruck) {
            rate = 50;
        } else {
            rate = 49;
        }
    } else if (power <= 250) {
        if (isTruck) {
            rate = 65;
        } else {
            rate = 75;
        }
    } else {
        if (isTruck) {
            rate = 85;
        } else {
            rate = 150;
        }
    }
    val tax = power * rate;

    println("Вид ТС: $carType \nМощность двигателя: $power л.с. \nНалоговая ставка: $rate руб./л.с. \nСумма налога: $tax руб.");

}