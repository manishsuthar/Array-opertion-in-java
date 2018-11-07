import java.util.Scanner;

public class LinkList {
	CommanFunction cf = new CommanFunction();
	static Node root;
	public int listCount;

	public LinkList(){
		root = new Node(0);
		listCount = 0;
	}

	public void PrintLinkList(){
		Node current = root;
		while(current.next!=null){
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		System.out.println(current.data);
	}

    public boolean add(int d){
    	Node end = new Node(d);
    	Node current = root;

    	while(current.next != null){
    		current = current.next;
    	}
    	current.next = end;
    	listCount++;
        System.out.println(d+"");
        return true;
    }
    
    public void CreateLoop(int length) {
    	if(this.root == null) {
    		cf.Print("Empty list");
    		return;
    	}
    	Node p1 = this.root,p2 = this.root;
    	int count = 0;
    	while(count < length) {
    		if(p2 == null) {break;}
    		p2 = p2.next;
            count++;
    	}
    	Node lastP2 = null;
    	while(p2 !=null) {
    		lastP2 = p2;
            p2 = p2.next;
            p1 = p1.next;
    	}
    	lastP2.next = p1;
        System.out.println("Loop of length "  + length + " added starting at node "  + p1.data);
    }
    
    public void deleteNode(int d){
    	Node current = root;
	        while(current.next!=null){
	            if(current.next.data==d){
	                current.next = current.next.next;
	                listCount--;
	                System.out.println("Success! Node with data "+d+" deleted.");
	                break;
	            }
	            current = current.next;
	        }
    	}
    public void RemoveDuplicate() {
    	Node current = root;
    	Node current2 = current.next;
    	while(current.next!=null) {
    		while(current2.next!=null) {
    			if(current.next.data==current2.next.data){
	                current.next = current.next.next;
	                listCount--;
	                System.out.println("Success! deleted.");
	                break;
	            }
    			current2 = current2.next;
    		}
    		current = current.next;
    		current2 = current.next;
    	}
    }
    
    public Node detectLoop() {
    	Node p1 = this.root;
    	Node p2 = p1;
    	do {
    		if (p1 == null || p2 == null || p2.next == null)
    	     {
    		  cf.Print("No loop found" );
    		  return null;
    	     }
    	      p1 = p1.next;
    	      p2 = p2.next.next;	
    	   }while(p1 !=p2);
    	  p1 = this.root;
    	 while (p1 != p2)
    	 {
    	  p1 = p1.next;
    	  p2 = p2.next;
    	  } 
    	  return p1;
    }
    
    public void reverseIteratively() { 
    	Node current = root;
    	Node previous = null;
    	Node forward = null;
    while(current.next != null){
          forward = current.next;
    	  current.next = previous;
    	  previous = current;
    	  current = forward;
    	}
    root = current;
    root.next = previous;
  }

    public static void main(String[] args) {
    	LinkList LL = new LinkList();
    	Scanner sc = new Scanner(System.in);
    	int[] arr = LL.cf.ReadArray();
    	for(int i=0;i<arr.length;i++) {
    		LL.add(arr[i]);
    	}
    	int exit = 0;
    	while(exit == 0) {
    		LL.cf.Print("\n 1. for Print Linklist \n 2. Create Loop in Linklist \n 3. Detect & Find Loop \n 4. Remove Duplicate \n 5. Reverse of Linklist \n 6. Exit");
    		int choice = sc.nextInt();
    		switch (choice) {
			case 1:
				LL.PrintLinkList();
				break;
			case 2:
				int loopValue = LL.cf.takeInput();
				LL.CreateLoop(loopValue);
				break;
			case 3:
				int data = LL.detectLoop().data;
				LL.cf.Print("Loop at "+ data);
				break;
			case 4:
				LL.RemoveDuplicate();
				break;
			case 5:
				LL.reverseIteratively();
				break;
			case 6:
				  exit = 1;
				break;
			}
    	}
    }
}