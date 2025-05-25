package Tasks

fun main() {
    val numbers = 0..1000 step 2
    val num = readln().toInt();
//    var flag = "не входит";
//    for (num2 in numbers) {
//        if (num == num2) {
//            flag = "входит";
//            break
//        }
//    }
//
//    println("Число $num $flag в диапазон");

    //другое решение:
    val result = num in numbers; // автоматически проверяет наличие в коллекции
    print(result);

}