import java.util.Arrays;
// The complexity of this algorithm is O(N^2) This algorithm the same speed with selectionSort

public class Assignment7 {

	public static void main(String[] args) {
		
		//Create 2 arrays for test
		int [] list1 = {-2, 87, 45, 29, 6, 74, 30, 58};
		int [] list2 = {76, 43, 86, 5, 3, -4, 77, 97};
		
		//printing both arrays before sorting
		System.out.println("Array 1 before sorting: " + Arrays.toString(list1));
		System.out.println("Array 2 before sorting: " + Arrays.toString(list2));
		
		//calling selectionSortModified method 
		selectionSortModified(list1);
		selectionSortModified(list2);
		
		//printing arrays after sorting
		System.out.println("Array 1 after sorting: " + Arrays.toString(list1));
		System.out.println("Array 2 after sorting: " + Arrays.toString(list2));
		
	}
	
	//writing modified selection sort method 
	public static void selectionSortModified(int [] a) {
		for (int i = a.length - 1; i>=0; i--) {
			int max = i;
			for (int j = 0; j<i; j++){
				if (a[j] > a[max]) {
					max = j;
				}
			}
			//calling the swap method 
			swap(a, i, max);
		}
	}
	
	//creating the modified swap method 
	public static void swap(int [] a, int i, int max) {
		int temp = a[i];
		a[i] = a[max];
		a[max] = temp;
	}

}
	
