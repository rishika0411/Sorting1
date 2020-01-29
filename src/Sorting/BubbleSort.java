package Sorting;

public class BubbleSort {
	void bubblesort(int arr[]) {
		for (int i=0;i<=arr.length-1;i++) 
			 for(int j = 0; j < arr.length-i-1; j++) 
            if (arr[j] > arr[j+1]) 
            { 
                
                int temp = arr[j]; 
                arr[j] = arr[j+1]; 
                arr[j+1] = temp; 
            } 
		}
	void printArray(int arr[]) 
    { 
       
        for (int i=0; i<arr.length; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
		

	
public static void main(String args[]) 
{ 
    BubbleSort ob = new BubbleSort(); 
    int arr[] = {2,5,1,3,8,9,4}; 
    ob.bubblesort(arr); 
    System.out.println("Sorted array"); 
    ob.printArray(arr); 
} 
} 


