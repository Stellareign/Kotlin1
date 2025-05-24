package Tasks

fun main() {
    print("Введите первое число: ")
    val num1 = readln().toDouble();
    print("Введите оператор действия: (*,/,+,-)")
    val operator = readln();
    print("Введите второе число: ")
    val num2 = readln().toDouble();
    var result = 0.0;
    if(operator == "+") {
        result = num1 + num2;
    } else if (operator == "-") {
        result = num1 - num2;
    } else if (operator == "*") {
        result = num1 * num2;
    } else if (operator == "/") {
        result = num1 / num2;
    }
    print("Результат = $result");
}