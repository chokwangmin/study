package loopEx;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int count;
//		int sum = 0;
//		for(count = 1; count <=10; count++) {
//			sum = sum+ count;
//		}
//		System.out.println(sum);
		
		for(int i = 2; i <= 9; i++) {
			 if(i == 5) {
				// break;
				continue; 
			 }
				 
			for(int j = 1; j <= 9; j++) {
			 System.out.println( i + "*" + j + "=" + (i*j));
			 
			 if(i == 5) {
				 break;
			 }
			 
			}
	}

}
}

