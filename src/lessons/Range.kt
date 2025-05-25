package lessons
/**
* диапазоны
*/
fun main() {
    val numbers = 0..1000 step 10 //диапазон очень похож на коллекцию (включая первое и последнее значение) / step - шаг диапазона
    val numbers2 = 0 until 1000 // не включая последнее значение (также можно записать: val numbers2 = 0..<1000)
    for (num in numbers) {
        println(num);
    }
}