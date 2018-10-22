import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Todo: should write description for classes and functions..
 */
public class Main {
    /**
     * TTodo: function name should be correctly defined. and camelcasing should be used.
     * @param str
     */
    public static void MyPrint(String str){
         System.out.println("\n"+str+"\n");
    }
    public static void ArrayPrint(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}
    public static void InitalFunction(){
        Scanner Data = new Scanner(System.in);
        MyPrint("Enter Sorting Type \n 1. Bubble Sort \n 2. Insertion Sort \n 3. Selection Sort \n 4. Marge Sort \n 5. Heap Sort \n 6. Quick Sort \n 7. Exit");
        String SortingType = Data.next();
        if(SortingType.equals("1") || SortingType.equals("2") || SortingType.equals("3") || SortingType.equals("4") ||SortingType.equals("5") || SortingType.equals("6")) {
            MyPrint("Enter Array Size");
            String ArrSize =  Data.next();
                MyPrint("Enter Array Value to Sorting");
                int[] ArrayToSort = new int[parseInt(ArrSize)];
                for(int i = 0; i< ArrayToSort.length; i++){
                    MyPrint("Enter Value : "+(i+1));
                    int tempValue = Data.nextInt();
                    ArrayToSort[i] = tempValue;
            }
            Sorting.SortingFunction(parseInt(SortingType),ArrayToSort);
        }else{
            if(SortingType.equals("7")){
                Main.MyPrint("Stop Execution");
                System.exit(1);
            }
            else
            MyPrint("Enter Correct Input");
            InitalFunction();
        }
    }
    public static void main(String[] args) {
        InitalFunction();
    }
}
