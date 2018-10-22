
public class QuickSorting {
    void QuickSort(int[] ArrayToSort,int low,int high){
    	if(low >= high) { return;}
    	int pivot = ArrayToSort[high];
    	int i=low,j=high;
    	while(ArrayToSort[i]<pivot) {i++;}
    	while(ArrayToSort[j]<pivot) {j--;}
    	if(i<=j) {
    		int temp = ArrayToSort[i];
    		ArrayToSort[i] = ArrayToSort[j];
    		ArrayToSort[j] = temp;
    		i++;
    		j--;
    	}
    	if(low < j){QuickSort(ArrayToSort,low,j);}
    	if(high > i){QuickSort(ArrayToSort,i,high);}
    }
}
