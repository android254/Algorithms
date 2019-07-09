/**
 *
 * Provides Generic Interface for Search Algorithms
 *
 **/
interface Search {

    /**
     *
     * @param data the array which the specified element will be looked for
     * @param element the item to be looked for
     * @return index of element ,if multiple will return first index
     *
     */
    fun <T : Comparable<T>> search(data: Array<T>, element: T): Int
}