## Sorting Algorithms

Sorting Algorithms are used to put elements in a given set of data in a certain order.

1. **Selection Sort**

Given a set of data,Selection sort;

 - Selects the smallest/minimum or largest/maximum value in the data set depending on desired order.
 - Places the smallest/minimum or largest/maximum at the beginning of the data set ,if it is already at the beginning it will move on to next element
 otherwise it will swap the value initially at the starting index with the minimum/maximum value and this will go on for each index till it traverses to the end.
 This is achieved by using a temporary variable to swap elements from one index to another.
 - Results in two subsets of data ;sorted and unsorted.The unsorted subset is broken down further to smaller subsets as sorting goes on until the whole list is sorted.
 
Due to the fact that it has atleast 2 loops one being nested ```n*n```,in terms of analysis;
n being the time taken to execute the code

__Best Case Scenario__ : 0(n^2)

__Worst Case Scenario__: 0(n^2)

__Average Case Scenario__: 0(n^2)