package INSERTIONSORT;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {
		int arr[] = {50,40,30,20,10};
		insertSort(arr, arr.length);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	static void insertSort(int arr[] , int n) {
		int key , j;
		for(int i=1 ; i<n ; i++) {
			key = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
