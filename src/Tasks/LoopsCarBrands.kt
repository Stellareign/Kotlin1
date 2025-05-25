package Tasks

fun main() {
    val brands = listOf("Toyota", "KIA", "Henday", "Mazda", "BMW");
    val brand = readln();
    var flag = false;
    var count = 0;
    //while()
//    while (count < brands.size) {
//        if(brands[count] == brand) {
//            flag = true;
//
//            break;
//        }
//        count++;
//    }
    // for()
    for(brand2 in brands) {
        if(brand2 == brand) {
            flag = true;
        }
    }
    print(flag);
}