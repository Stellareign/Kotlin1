package lessons

fun main() {
//    val a = 10.0;
//    val b = 3.0;
//    val result : Double = a / b;
//    val result2 = a % b;
//    println(result);
//    println(result2);
    // timer
    val seconds = readln().toInt();
    val hours = seconds / 3600;
    val minutes = seconds % 3600 / 60;
    val remainingSeconds = seconds % 3600 % 60;
    println("timer: $hours:$minutes:$remainingSeconds");


}