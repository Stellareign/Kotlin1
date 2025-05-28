package Tasks

fun main() {
    val age = readln().toLong();
    val ageInSeconds = age * 365 * 24 * 60 * 60;
    println(ageInSeconds);
}
