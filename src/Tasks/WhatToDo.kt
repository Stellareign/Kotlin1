package Tasks

fun main() {
    print("Сколько у вас денег? ");
    val amountOfMoney = readln().toInt();
    print("Вы голоды? true / false ")
    val isHungry = readln().toBoolean();
    if (isHungry && amountOfMoney > 500) {
        println("Покупаем пиццу!");
    } else if (isHungry) {
        println("Покупаем доширак");
    } else if (amountOfMoney < 500) {
        println("Пошли гулять!");
    } else {
        println("Айда в кино!");
    }

}
