package lessons

fun main() {
    val temperature = readln().toInt();
    if (temperature > 25) {
        println("Включить кондиционер");
    } else if (temperature < 20) {
        println("Включить обогрев");
    } else {
        println("Кондей не нужен");
    }

}