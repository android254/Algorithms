import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class SelectionSortTest {

    lateinit var selectionSort: SelectionSort

    @Before
    fun selectionSort() {
        selectionSort = SelectionSort()
    }

    @Test
    fun sortArray() {
        //Unsorted
        val alphabets = arrayOf('s', 'r', 'e', 'w', 't', 'a', 'r', 'p', 'z', 'b', 'd', 'y', 'z', 'y')
        val numbers = arrayOf(1, 3, 78, 32, 1, 23, 0, 2, 33, 2909, 4590, 12, 123, 342, 6)

        //Sorted
        val alphabetsSorted = arrayOf('a', 'b', 'd', 'e', 'p', 'r', 'r', 's', 't', 'w', 'y', 'y', 'z', 'z')
        val numbersSorted = arrayOf(0, 1, 1, 2, 3, 6, 12, 23, 32, 33, 78, 123, 342, 2909, 4590)

        assertTrue("Characters should follow natural order", selectionSort.sort(alphabets).contentEquals(alphabetsSorted))
        assertTrue("Numbers should follow natural order", selectionSort.sort(numbers).contentEquals(numbersSorted))
    }

    @Test
    fun sortList() {
        //Unsorted
        val namesList = mutableListOf("David", "Dorothy", "Daniel", "Dimitry", "Duncan", "Drogba", "Douglas", "Diplo", "Daenarys", "Dee")
        val numberList = mutableListOf(712345623, 123455, 338472, 49821, 3384001, 420480, 20480284, 1024824, 4288402, 9274927, 497294, 4927490)

        val namesListSorted = mutableListOf("Daenarys", "Daniel", "David", "Dee", "Dimitry", "Diplo", "Dorothy", "Douglas", "Drogba", "Duncan")
        val numberListSorted = mutableListOf(49821, 123455, 338472, 420480, 497294, 1024824, 3384001, 4288402, 4927490, 9274927, 20480284, 712345623)

        assertTrue("Names should follow natural order", selectionSort.sort(namesList) == namesListSorted)
        assertTrue("Numbers should follow natural order", selectionSort.sort(numberList) == numberListSorted)
    }
}