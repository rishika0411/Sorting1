package Sorting;

public class InsertionSort {
	
	void sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) { 
            int k = arr[i]; 
            int j = i - 1; 
  
	
		while (j >= 0 && arr[j] > k) { 
            arr[j + 1] = arr[j]; 
            j = j - 1; 
        } 
        arr[j + 1] = k; 
    } 
} 
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ 
	        int arr[] = { 78,24,6,35,12,13,66 }; 
	  
	        InsertionSort ob = new InsertionSort(); 
	        ob.sort(arr); 
	  
	        printArray(arr); 
		

	}

}}
