package Tasks

fun main() {
    val monthNumber = readln().toInt();
    val result = when (monthNumber) {
        12, 1, 2 -> "Winter"; // если действий в условии мало, можно не ставить {} (также в if-else) (аналог switch)
        3, 4, 5 -> "Spring";
        6, 7, 8 -> "Summer";
        9, 10, 11 -> "Autumn";
        else -> "нет такого месяца";
    }
    println(result);
}