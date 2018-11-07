import java.util.Scanner;

public class CommanFunction {
        Scanner sc = new Scanner(System.in);
      public void Print(int printable) { System.out.println(printable); }
      public void Print(String printable){System.out.println(printable);}
      //Read An Array
      public int[] ReadArray() {
         Print("Enter Size of An Array");
            int size = sc.nextInt();
            int[] array = new int[size];
            Print("Enter Element in Array");
            for (int i=0;i<array.length;i++){
                array[i] = sc.nextInt();
            }
            return array;
      }
      //String Array Print
      public void PrintArray(String[] arr) {
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"_");
         }
      }
      //Print Integer Array
      public void PrintArray(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"_");
         }
      }
      //Read One Interger Element
      public int ReadElement() {
    	  int reader = sc.nextInt();
    	  return reader;
      }
}