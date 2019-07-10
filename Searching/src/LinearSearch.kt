/**
 *
 * Implementation of LinearSearch Algorithm
 *
 */
class LinearSearch : Search {
    override fun <T : Comparable<T>> search(data: Array<T>, element: T): Int {
        for (i in 0 until data.size) {
            if (data[i] == element)
                return i
        }
        return -1
    }
}