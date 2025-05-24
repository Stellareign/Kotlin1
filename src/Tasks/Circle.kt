package Tasks

fun main() {
    print("Введите радиус круга: ")
    val radius = readln().toDouble();
    val pi = 3.14;
    println("Радиус: $radius\nДлина окружности: ${2 * pi * radius}\nПлощадь круга: ${pi * radius * radius}");
}