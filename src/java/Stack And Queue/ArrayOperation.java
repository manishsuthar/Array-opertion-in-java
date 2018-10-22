import java.util.Scanner;

public class ArrayOperation {
	Stack stack = new Stack();
	Queue queue = new Queue();
	StacktoQueue stackqueue = new StacktoQueue();
	 void getData() {
		DP.Print("1. Stack Operation \n 2. Queue Operation \n 3. Stack to Queue");
		Scanner sc = new Scanner(System.in);
		String option = sc.next();
		switch (option) {
		case "1":
			stack.StackOperation();
			break;
		case "2":
			queue.QueueOperation();
			break;
		case "3":
			stackqueue.StackQueueOperation();
		default:
			DP.Print("Enter Incorrect");
			getData();
			break;
		}
	}
    public static void main(String[] args) {
		ArrayOperation Ap = new ArrayOperation();
		Ap.getData();
	}
}
