package bubblesort;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		int arr[] = {90,50,70,40,30,10};
		bubbleSort(arr, arr.length);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void bubbleSort(int arr[] , int n) {
		boolean flag = true;
		for(int i=0 ; i<n-1 ; i++){
			for(int j=0 ; j<n-i-1 ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
			if(flag) break;
		}
	}

}
