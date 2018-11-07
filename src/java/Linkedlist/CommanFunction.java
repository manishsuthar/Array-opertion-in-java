import java.util.Scanner;


public class CommanFunction {
    Scanner sc = new Scanner(System.in);
    public void Print(String str){
        System.out.println(str);
    }
    public void Print(int value){
        System.out.println(value);
    }
    public int[] ReadArray(){
        Print("Enter Size of Linklist");
        int size = sc.nextInt();
        int[] arr = new int[size];
        Print("Enter Element in LinkList");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            Print(arr[i]);
        }
    }
    public int takeInput() {
    	return sc.nextInt();
    }
}
