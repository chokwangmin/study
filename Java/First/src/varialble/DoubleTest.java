package varialble;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dNum = 3.14;
		
		float fNum = 3.14f;
		System.out.println(dNum);
		System.out.println(fNum);
		
		double dNum2 = 1;
		for ( int i = 0; i < 10000; i++) {
			dNum2 = dNum2 + 0.1;
		}
		System.out.println(dNum2);
		
	}

}
