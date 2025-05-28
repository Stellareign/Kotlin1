package Tasks


fun main() {
    print("Введите пример: ")
    val example = readln();
    val readExample = example.split(" ");

    var result = 0.0;

    if (readExample.contains("+")) {
        result = readExample[0].toDouble() + readExample[2].toDouble();
    } else if (readExample.contains("-")) {
        result = readExample[0].toDouble() - readExample[2].toDouble();
    } else if (readExample.contains("*")) {
        result = readExample[0].toDouble() * readExample[2].toDouble();
    } else if (readExample.contains("/")) {
        result = readExample[0].toDouble() / readExample[2].toDouble();
    }
    print("Результат = $result");
}