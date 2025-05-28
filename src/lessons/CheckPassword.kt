package lessons

fun main() {
    print("enter your pass ");
    val pass = readln().toCharArray();
    var count = 0;
    var isLong = false;
    var isDigit = false;
    var isLetter = false;
    var isSimbol = false;
    pass.forEach { i ->
        if (i.isDigit()) {
            isDigit = true;
        }
        if (pass.size >= 8) {
            isLong = true;
        }
        if (i.isLetter()) {
            isLetter = true;
        }
        if (i.isLetterOrDigit()) {
            isSimbol = true;
        }
    }
    if (isDigit && isLetter && isSimbol && isLong) {
        print("pass is correct")
    } else {
        println("Your password is incorrect");
    }

}


