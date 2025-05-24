package Tasks

fun main() {
    //100.50.20.10.5.2.1
    val cash = readln().toInt();
    val cash100 = cash / 100;
    val cash50 = cash % 100 / 50;
    val cash20 = cash % 100 % 50 / 20;
    val cash10 = cash % 100 % 50 % 20 / 10;
    val cash5 = cash % 100 % 50 % 20 % 10 / 5;
    val cash2 = cash % 100 % 50 % 20 % 10 % 5 / 2;
    val cash1 =  cash % 100 % 50 % 20 % 10 % 5 % 2;
    println("Вам доступно:\n100$ - ${cash100}шт\n50$ - ${cash50}шт\n20$ - ${cash20}шт\n10$ - ${cash10}шт\n5$ - ${cash5}шт\n2$ - ${cash2}шт\n1$ - ${cash1}шт");


}