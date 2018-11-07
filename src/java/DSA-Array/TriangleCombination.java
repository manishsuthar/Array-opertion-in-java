import java.util.Arrays;

public class TriangleCombination {
   public int CountNumber(int[] arr){
	   int count = 0;
	   for (int i = 0; i < arr.length - 2; i++) {
           int k = i + 2;
           for (int j = i + 1; j < arr.length - 1 && arr[i] != 0; j++) {
               while (k < arr.length && arr[i] + arr[j] > arr[k])
                 k++;
               count += k - j - 1;
           }
       }
	  return count;
   }
   public static void main(String[] args) {
      CommanFunction cf = new CommanFunction();
      TriangleCombination ds1 = new TriangleCombination();
      int [] array = cf.ReadArray();
      if(array.length < 3){ cf.Print("Array must be Greater then 2 Values");}
      Arrays.sort(array);
      cf.Print(ds1.CountNumber(array));
   }
}