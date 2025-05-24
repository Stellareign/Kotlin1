package lessons

fun main() {
    print("Погода сейчас хорошая? true /false ");
    val isGoodWeather = readln().toBoolean();
    print("Сколько времени? ");
    val time = readln().toInt();
    val isDay = (time < 22) && (time > 5);
    if (isDay && isGoodWeather) {
        print("Иди гулять");
    } else if (isDay) {
        print("Почитай книгу");
    } else {
        print("Спим");
    }


}
