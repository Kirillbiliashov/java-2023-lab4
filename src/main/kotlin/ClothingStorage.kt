
/**
 * Class that stores list of initialized clothes
 * @property clothes Clothes list that will be sorted by class methods
 */

object ClothingStorage {

    val clothes = mutableListOf(
        Clothing("Adidas", "Shirt", 29.99, 50, true),
        Clothing("Levi's", "Jeans", 49.99, 30, true),
        Clothing("Calvin Klein", "Dress", 59.99, 20, true),
        Clothing("Gucci", "Sweater", 39.99, 40, true),
        Clothing("Nike", "Shorts", 19.99, 60, true),
        Clothing("Stone Island", "Jacket", 79.99, 15, false),
        Clothing("H&M", "Skirt", 34.99, 25, false),
        Clothing("Puma", "Trousers", 44.99, 35, true),
        Clothing("Ralph Lauren", "T-Shirt", 14.99, 70, true),
        Clothing("Puma", "Hoodie", 54.99, 10, true)
    )
}
