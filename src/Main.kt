fun main() {
    val fruits = listOf("Яблоко","Абрикос","Банан","Виноград","Вишня","Кокос","яблоко")

    println(fruits.filter { it.length % 2 == 0 }.groupBy { it.first().lowercase() })




}