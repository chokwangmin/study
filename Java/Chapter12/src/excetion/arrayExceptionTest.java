package excetion;

public class arrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		try {
			
		
		for(int i=0; i <= 5; i++) {
			System.out.println(arr[i]);
		}
		//throw new Exception("�����簡 ���� ����");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}finally {
			System.out.println("���α׷� ����");
		}
	}

}
