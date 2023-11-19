
/**
 * Class that stores list of clothes and provides methods to sort a list of Clothing objects based on specific criteria.
 * @property clothes Clothes list that will be sorted by class methods
 */

class ClothingSorter(private val clothes: MutableList<Clothing>) {

    /**
     * Sorts the list of Clothing objects by the 'type' field in ascending order using the Bubble Sort algorithm.
     */
    fun sortByTypeAscending() {
        performBubbleSort(true)
    }

    /**
     * Sorts the list of Clothing objects by the 'quantity' field in descending order using the Bubble Sort algorithm.
     */
    fun sortByQuantityDescending() {
        performBubbleSort(false)
    }

    /**
     * Performs the Bubble Sort algorithm on the list of Clothing objects based on the specified field.
     *
     * @param isTypeField If true, sorting is based on the 'type' field; if false, sorting is based on the 'quantity' field.
     */
    private fun performBubbleSort(isTypeField: Boolean) {
        val size = clothes.size
        for (i in 0 until size - 1) {
            var swapHappened = false
            for (j in 0 until size - i - 1) {
                if (swapNeeded(j, isTypeField)) {
                    val temp = clothes[j]
                    clothes[j] = clothes[j + 1]
                    clothes[j + 1] = temp
                    swapHappened = true
                }
            }
            if (!swapHappened) break
        }
    }

    /**
     * Checks if a swap is needed based on the specified field.
     *
     * @param idx          The index of the current Clothing object.
     * @param isTypeField  If true, comparison is based on the 'type' field; if false, comparison is based on the 'quantity' field.
     * @return True if a swap is needed, false otherwise.
     */
    private fun swapNeeded(idx: Int, isTypeField: Boolean): Boolean {
        if (isTypeField) return clothes[idx].type > clothes[idx + 1].type
        return clothes[idx].quantity < clothes[idx + 1].quantity
    }

}