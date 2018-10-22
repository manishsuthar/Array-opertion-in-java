import java.util.Scanner;
public class StacktoQueue {
    Stack stack = new Stack();
    void readOperation(String[] Arr,int top) {
        DP.Print("Press 1. Push \n 2.POP \n 3.Print Array \n4. Peek \n 5. Exit");
        Scanner sc = new Scanner(System.in);
        String op = sc.next();
        switch (op) {
            case "1":
                if(Arr[0] != null) {
                    DP.Print("Stack Overflow");
                    break;
                }
                DP.Print("Enter Value to Push");
                String val = sc.next();
                if(top == Arr.length)
                    top--;
                stack.Push(Arr,val,top);
                top--;
                break;
            case "2":
                int temp = Arr.length-1;
                if(Arr[temp] == null) {
                    DP.Print("Queue is Empty");
                    break;
                }
                if(top == -1)
                    top=0;
                POP(Arr,top);
                //top++;
                break;
            case "3":
                DP.PrintArray(Arr);
                break;
            case "4":
                stack.peek(Arr);
                break;
            case "5":
                return;
            default:
                break;
        }
        readOperation(Arr,top);
    }
    void POP(String[] str,int top) {
        String[] tempArr = new String[str.length];
        DP.PrintArray(str);
        int j = str.length-1;
        for (int i=0;i< str.length; i++){
            tempArr[j] = str[i];
            str[i] = null;
            j--;
        }
        tempArr[top] = null;
        j = str.length-1;
        for (int i=1;i< str.length; i++){
            str[j] = tempArr[i];
            j--;
        }
        top++;
        readOperation(str,top);
    }
    void StackQueueOperation() {
        StacktoQueue s = new StacktoQueue();
        int ArraySize =  DP.GetArraySize();
        String[] str = new String[ArraySize];
        int top = ArraySize-1;
        s.readOperation(str,top);
    }
}
