package lessons

fun main() {
    val names = listOf("Stacy", "Busia", "Misty", "Begemot", "Margo");
    print("Enter name: ");
    val name = readln();
//    var index = 0;
//    while (index < names.size) {
//        if (names[index] == name) {
//            print("Yes ");
//            break;// выходим из цикла сразу после добавления заданного условия (экономим время и память)
//        }
//        index++;
//    }
    // цикл for()  - не такой, как в java, похож на форыч... :-)
    for (name2 in names) {
        if (name == name2) {
            print("Yes ");
            break; // выходим из цикла сразу после добавления заданного условия (экономим время и память)
        }
    }
}