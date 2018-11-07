
public class KthLargerElementInArray {
	CommanFunction cf = new CommanFunction();
	public void KthLargerElement(){
		int arr[] = cf.ReadArray();
		cf.Print("Enter Kth Element");
		int Kth = cf.ReadElement();
		int count = 0;
		int KthElement = 0;
		if(Kth == 0 || Kth > arr.length) {cf.Print("InValid Input");return;}
		for(int i = 0;i<arr.length;i++) {
			for(int j = 1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					count++;
				}
				if(count == Kth) {
					KthElement = arr[i];
					break;
				}
			}
		}
		cf.Print(KthElement);
	}
	public static void main(String[] args) {
		KthLargerElementInArray ds3 = new KthLargerElementInArray();
		ds3.KthLargerElement();
	}
}
