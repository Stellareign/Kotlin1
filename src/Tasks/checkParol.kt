package Tasks

/**
 * тема 2.17
 */
fun main() {
    print("enter your pass ");
    val pass = readln().toCharArray();
    var isSolidSign= false;
    pass.forEach { i ->
        if (i=='ъ' || i == 'Ъ') {
           isSolidSign = true;
        }
    }
    if (isSolidSign) {
        print("У вас идеальный пароль!")
    } else {
        println("Опс! В вашем пароле кое-чего не хватает");
    }
}