

fun main() {
    val clothes = ClothingStorage.clothes
    val sorter = ClothingSorter(clothes)
    sorter.sortByTypeAscending()
    println("Sorted by type in asc order:")
    clothes.forEach { println(it) }
    sorter.sortByQuantityDescending()
    println("Sorted by quantity in desc order:")
    clothes.forEach { println(it) }
}