package lessons

fun main() {
//    val family = listOf<String>("Stacy", "Busia","Mistika", "Begemote", "Margo");
//    val stacy = family[0];
//    println(stacy);
//    println(family[3])
    val year = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
    val monthNum = readln().toInt();
    if (monthNum < 0 || monthNum > 12) {
        println("Такого месяца в календаре нет")
    } else {
        println(year[monthNum - 1]);
    }
}
