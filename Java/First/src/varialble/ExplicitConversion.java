package varialble;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 명시적 형변환
		
		int i = 1000;
		byte bNum = (byte)i;
		System.out.println(bNum);
		
		
	double dNum = 1.2;
	float fNum = 0.9f;
	int iNum1 = (int)dNum + (int)fNum;
	int iNum2 = (int)(dNum + fNum);
	
	System.out.println(iNum1);
	System.out.println(iNum2);
	}
	

}
