import java.util.Scanner;

public class Stack {
	
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
			Push(Arr,val,top);
			top--;
			break;
		case "2":
			int temp = Arr.length-1;
			if(Arr[temp] == null) {
				DP.Print("Stack is Empty");
				break;
			}
			if(top == -1)
			top=0;
			POP(Arr,top);
			top++;
			break;
		case "3":
			DP.PrintArray(Arr);
			break;
		case "4":
			peek(Arr);
			break;
		case "5":
			return;
		default:
			break;
		}
	    readOperation(Arr,top);
	}
	void POP(String[] str,int top) {
			str[top] = null;
	}
	void Push(String[] str,String value,int top) {
		str[top] = value;
	}
	void peek(String [] str) {
		DP.Print(str[0]);
	}
	void StackOperation() {
		Stack s = new Stack();
		int ArraySize =  DP.GetArraySize();
		String[] str = new String[ArraySize];
	    int top = ArraySize-1;
	    s.readOperation(str,top);
	}
}
