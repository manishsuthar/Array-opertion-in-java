
public class CountOfLongestSeq {
	CommanFunction cf = new CommanFunction();
	public void LongestCommanSubSequance() {
		int arr[] = cf.ReadArray();
		int count = 0,totalCount = 0;
		for(int i=0;i<arr.length;i++) {
			count = count+arr[i];
			if(count > totalCount) {
				totalCount = count;
			}
			if(count < 0) {
				count = 0;
			}
		}
		cf.Print(totalCount);
	}
	public static void main(String[] args) {
		CountOfLongestSeq ds4 = new CountOfLongestSeq();
		ds4.LongestCommanSubSequance();
	}
}
