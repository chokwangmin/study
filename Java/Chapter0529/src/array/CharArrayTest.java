package array;

public class CharArrayTest {
//배열
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alpabets = new char[26];
		char ch = 'A';
		
		
		//a~z 배열 할당
		for(int i =0; i<alpabets.length; i++) {
			alpabets[i] = ch++;
		}
		//a~z 출력 문자코드와 함께
		for(int i=0; i<alpabets.length; i++) {
			System.out.println(alpabets[i] + "-" + (int)alpabets[i]);
		}
	
	}

}
