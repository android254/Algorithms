/**
 *
 * Implementation of LinearSearch Algorithm
 *
 */
class LinearSearch : Search {
    override fun <T : Comparable<T>> search(data: Array<T>, element: T): Int {
        data.forEachIndexed { index, currentElement ->
            if (currentElement == element) return index
        }
        return -1
    }
}