package Tasks

fun main() {
    val startNum = readln().toInt();
    val endNum = readln().toInt();
    val range = startNum..endNum step 8;
    for (x in range) {
        print("$x ");
    }
}