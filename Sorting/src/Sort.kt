/**
 *
 * Provides Generic Interface for Sorting Algorithms
 *
 */
interface Sort {

    /**
     *
     * @param unsorted an array of items which are to be sorted in a specified order
     * @return a sorted array of items from the unsorted list
     *
     */
    fun <T : Comparable<T>> sort(unsorted: Array<T>): Array<T>

    /**
     *
     * Provides an alternative to working with arrays
     *
     * @param unsorted a list of items which are to be sorted in a specified order
     * @return a sorted list of items from the unsorted list
     *
     */
    fun <T : Comparable<T>> sort(unsorted: MutableList<T>): List<T>
}