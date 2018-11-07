
public class SortZeroOneTwo {
	CommanFunction cf = new CommanFunction();
	public void SortArray() {
		int[] arr = cf.ReadArray();
		int zero = 0,one = 0;
		for(int i=0;i < arr.length ; i++) {
		   if(arr[i] == 0){ zero++;}
		   if(arr[i] == 1){ one++;}
		}
		for(int i=0;i<arr.length;i++) {
			if(zero > 0){ arr[i] = 0;zero--;}
			else if(zero == 0 && one > 0) {arr[i] = 1;one--;}
			else if(zero == 0 && one == 0) {arr[i] = 2;}
		}
		cf.PrintArray(arr);
	}
	public static void main(String[] args) {
		SortZeroOneTwo ds2 = new SortZeroOneTwo();
		ds2.SortArray();
		
	}
}
