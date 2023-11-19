
/**
 * Represents a piece of clothing with details such as brand, type, price, quantity, and stock availability.
 *
 * @property brand The brand of the clothing.
 * @property type The type or category of the clothing.
 * @property price The price of the clothing.
 * @property quantity The quantity of the clothing available in stock.
 * @property inStock Indicates whether the clothing is currently in stock (true) or out of stock (false).
 */
data class Clothing(
    val brand: String,
    val type: String,
    val price: Double,
    val quantity: Int,
    val inStock: Boolean
)