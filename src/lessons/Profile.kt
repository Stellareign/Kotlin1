package lessons

fun main() {
    print("Enter your name: ");
    val name = readln();
    print("Enter your age: ");
    val age = readln();
    print("Enter your sex: ");
    val sex = readln();
    print("Enter your height: ");
    val height = readln();
    print("Enter your weight: ");
    val weight = readln();
//
//    println("name: " + name + ", \nage: " + age + ", \nsex: " + sex +
//            ", \nheight: " +height + ", \nweight: " + weight);
    println("name: $name, \nage: $age, \nsex: $sex, \nheight: $height, \nweight: \"$weight\"");

}