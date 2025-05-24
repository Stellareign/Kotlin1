package lessons

fun main() {

    var temperature = readln().toInt();
    var airConditionalIsOn = false;
    if (temperature > 25) {
        airConditionalIsOn = true;
        //  println("Включить кондиционер");
    } else if (temperature < 20) {
        airConditionalIsOn = false;
        //   println("Включить обогрев");
    } else {
        //  println("Кондей не нужен");
    }
    if (airConditionalIsOn) {
        temperature -= 5;
    } else {
        temperature += 5;
    }

//    print("Air conditioner is on: $airConditionalIsOn");
    println("Current temperature: $temperature");

    if (temperature >= 25) {
        airConditionalIsOn = true;

    } else if (temperature < 20) {
        airConditionalIsOn = false;

    } else {
    }
    if (airConditionalIsOn) {
        temperature -= 5;
    } else {
        temperature += 5;
    }
    print("Current temperature: $temperature");

}