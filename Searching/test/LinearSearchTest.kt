import org.junit.Test

import org.junit.Assert.*

class LinearSearchTest {

    @Test
    fun search() {
        val linearSearch = LinearSearch()

        val numbersArray = arrayOf(1, 3, 4, 5, 56, 4, 5, 6, 7, 84, 3, 3564, 64, 234, 35, 43, 242, 5222, 425, 132, 453, 324, 324, 532, 422)
        val characterArray = arrayOf('a', 'b', 'v', 'f', 'r', 'r', 'e', 'q', 'y', 'u', 'y', 'j', 'k', 'l', 'b', 'g', 'y', 'x')

        val noNotFound = linearSearch.search(numbersArray, 2)
        val noFound = linearSearch.search(numbersArray, 324)
        val charNotFound = linearSearch.search(characterArray, 'o')
        val charFound = linearSearch.search(characterArray, 'y')

        assertTrue("That number exists", noNotFound == -1)
        assertTrue("That number does not exist", noFound == 21) //index of first instance
        assertTrue("That character exists", charNotFound == -1)
        assertTrue("That character does not exist", charFound == 8)
    }
}