/**
 * Created by Manish on 10/12/2018.
 */
public class Sort {
    //Bubble Sort
    public static int[] BubbleSort(int[] ArrayToSort){
   		for (int i = 0; i < ArrayToSort.length; i++) {
			   for (int j = 0; j < ArrayToSort.length; j++) {
				 if(ArrayToSort[i] < ArrayToSort[j]) {
					 int temp = ArrayToSort[i];
					 ArrayToSort[i] = ArrayToSort[j];
					 ArrayToSort[j] = temp;
				 }
			}	
		}
        return ArrayToSort;
    }
    //Selection Sort
    public static void SelectionSort(int[] ArrayToSort){
    	for (int i = 0; i < ArrayToSort.length; i++) {
    		int temp = ArrayToSort[i];
			for (int j = i+1; j < ArrayToSort.length; j++) {
				if(temp > ArrayToSort[j]) {
				  ArrayToSort[i] = ArrayToSort[j];
				  ArrayToSort[j] = temp;
				  temp = ArrayToSort[i];
				}
			}
		}
    }
    //Insertion Sort
    public static void InsertionSort(int[] ArrayToSort){
    	int j, temp;
    	for (int i = 1; i < ArrayToSort.length; i++) {
		    temp = ArrayToSort[i];
			j = i-1;
			while (j >= 0 && temp < ArrayToSort[j]) {
				ArrayToSort[j+1] = ArrayToSort[j];
				j = j-1;
			}
			ArrayToSort[j+1] = temp;
		}
        
    }

}
