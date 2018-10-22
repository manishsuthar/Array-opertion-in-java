import java.util.Scanner;

public class DP {
	public static void Print(String str) {
    	 System.out.print("\n"+str+"\n");
     }
    public static void PrintArray(String [] arr) {
    	 for (int i = 0; i < arr.length; i++) {
    	 	if(arr[i] != null)
			System.out.print(arr[i]+"_");
		}
		System.out.println("");
     }
    public static int GetArraySize(){
		Print("Enter Array Size");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ArraySize = sc.nextInt();
		return ArraySize;
	}
}
