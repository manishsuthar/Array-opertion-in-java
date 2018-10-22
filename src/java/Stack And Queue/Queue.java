import java.util.Scanner;

public class Queue {
	void readOperation(String[] Arr,int i,int j, int k) {
		DP.Print(" 1. Add \n 2.Remove \n 3.Print Array\n 4. Peek \n 5. Exit");
	    Scanner sc = new Scanner(System.in);
	    String op = sc.next();
	    switch (op) {
		case "1":
			if(j >= k) {
				DP.Print("Full");
				break;
			}
			DP.Print("Enter Value to Push");
			String val = sc.next();
			ADD(Arr,val,j);
			System.out.println(j + "#");
			j++;
			System.out.println(j + "#");
			break;
		case "2":
			if(i == j) {
				DP.Print("Empty");
				break;
			}
			if(j < 0)
			j=0;
			Remove(Arr);
			System.out.println(j + "#");
			j--;
			System.out.println(j + "#");
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
	    readOperation(Arr,i,j,k);
	}
	void Remove(String[] str) {
		  str[0] = null;
		for (int i = 1; i < str.length; i++) {
			str[i-1] = str[i];
			str[i] = null;
		}
	}
	void ADD(String[] str,String value,int j) {
		str[j] = value;
	}
	void peek(String [] str) {
		DP.Print(str[0]);
	}
	void QueueOperation() {
		Queue Q = new Queue();
		int ArraySize =  DP.GetArraySize();
		String[] str = new String[ArraySize];
	    int i = 0;
	    int j = 0;
	    int k = ArraySize;
	    Q.readOperation(str,i,j,k);
	}

}
