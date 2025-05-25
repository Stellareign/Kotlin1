package Tasks

fun main() {
    var age = readln().toInt();

    // через repeat()
        repeat(18 - age) { // здесь не нужно условие "если", так как 0 ра повторить нельзя ))
            println("Ждём ещё год!");
            age++
        }
    println("Идём в кино!");

//    // через while
//        while (age < 18) {
//            println("Ждём ещё год!");
//            age++
//        }
//        print("Идём в кино");

}