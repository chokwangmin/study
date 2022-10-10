package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 선언
		//int[] arr;
				//arr = new int[] {1,2,3};
		int[] arr = new int[10];	
		int total = 0;

			for(int i=0; num=1; i<arr.length; i++, num++) {
				arr[i] = num;
				//System.out.println(arr[i]);
				
			}
			for(int i =0; i<arr.length; i++) {
				total += arr[i];
			}
			System.out.println(total);
	}

}
