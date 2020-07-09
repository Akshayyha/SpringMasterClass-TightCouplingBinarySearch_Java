package Tight.Coupling;

public class BinarySearchImpl {
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//sorting array
		//Step 1:
		//Bubble sort Algorithm
		//add the logic to implement bubble sort -  - BinarySearchImpl is tightly coupled to bubble sort algorithm
		// so if the sort algorithm needs to be changed, the logic in here needs to be changed
		//removing it from here
		
		//Step 2:
		//separate sorting logic from this class
		BubbLeSortAlgo bubbleSort = new BubbLeSortAlgo();
		//Now bubble sort logic is separated from BinarySearchImpl
//		But still if I wanna change it to quick sort dynamically?
		int[] sortedNumbers = bubbleSort.sort(numbers);
		//even now we aren't able to switch between different sorting algorithms
		//so remove this too
		
		//Step 3:
		//Java way of loose coupling
		
		//Search array
		return 3; // index where the element is found in an array
	}
	
	
	
}
