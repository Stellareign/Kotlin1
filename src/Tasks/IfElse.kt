package Tasks

fun main() {
    val age1 = readln().toInt();
    val age2 = readln().toInt();
    if (age1 > age2) {
        println("Первый человек старше");
    } else if (age1 < age2) {
        println("Второй человек старше");
    } else {
        println("Два человека - ровесники");
    }
}