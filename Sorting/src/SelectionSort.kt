/**
 * Implementation of selection sort algorithm for arrays and lists
 */
class SelectionSort : Sort {
    override fun <T : Comparable<T>> sort(unsorted: Array<T>): Array<T> {
        //Get length of data set
        val arrayLength = unsorted.size
        for (i in 0 until arrayLength) {
            //Index will be used to find minimum element
            var index = i
            for (j in i + 1 until arrayLength) {
                if (unsorted[j] < unsorted[index])
                //Store position of smallest element
                    index = j
            }
            //Swap minimum element with first element in unsorted sublist
            val temp = unsorted[index]
            unsorted[index] = unsorted[i]
            unsorted[i] = temp
        }
        return unsorted
    }

    override fun <T : Comparable<T>> sort(unsorted: MutableList<T>): List<T> {
        val listLength = unsorted.size
        for (i in 0 until listLength) {
            var index = i
            for (j in i + 1 until listLength) {
                if (unsorted[j] < unsorted[index])
                    index = j
            }
            val temp = unsorted[index]
            unsorted[index] = unsorted[i]
            unsorted[i] = temp
        }
        return unsorted
    }
}
