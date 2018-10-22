
public class Heaping {
	  void HeapCreate(int[] arr,int elements,int mainRoot) {
		  int root = mainRoot;
		  int left = 2*root+1;
		  int right = 2*root+2;
		  if(left < elements && arr[left] > arr[root]) 
			root = left;
		  
		  if(right < elements && arr[right] > arr[root]) 
			root = right;
		  if(root != mainRoot){
			  int temp = arr[mainRoot];
			  arr[mainRoot] = arr[root];
			  arr[root] = temp;
			  HeapCreate(arr,elements,root);
		  }
	  }
      void HeapSort(int[] ArrayToSort) {
    	  int ArrayLength = ArrayToSort.length;
    	  for (int i = ArrayLength/2-1; i >=0; i--) 
    		  HeapCreate(ArrayToSort,ArrayLength,i);
    	  
    	  for (int i=ArrayLength-1; i>=0; i--) 
          { 
              int temp = ArrayToSort[0]; 
              ArrayToSort[0] = ArrayToSort[i]; 
              ArrayToSort[i] = temp; 
              HeapCreate(ArrayToSort, i, 0); 
          }
		
      }
}
