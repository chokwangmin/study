package array;

public class CharArrayTest {
//�迭
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alpabets = new char[26];
		char ch = 'A';
		
		
		//a~z �迭 �Ҵ�
		for(int i =0; i<alpabets.length; i++) {
			alpabets[i] = ch++;
		}
		//a~z ��� �����ڵ�� �Բ�
		for(int i=0; i<alpabets.length; i++) {
			System.out.println(alpabets[i] + "-" + (int)alpabets[i]);
		}
	
	}

}
