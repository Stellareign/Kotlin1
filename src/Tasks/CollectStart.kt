package Tasks

fun main() {
    val year = listOf(
        "Январь",
        "Февраль",
        "Март",
        "Апрель",
        "Май",
        "Июнь",
        "Июль",
        "Август",
        "Сентябрь",
        "Октябрь",
        "Ноябрь",
        "Декабрь"
    );
    val month = readln().toInt();
    if (month < 1 || month > 12) {
        println("Некорректное значение: $month");
    } else (println(year[month - 1]))
}