package ifEx;

public class ifEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ���� ���� �ο��ϱ�
		
		/* 100 - 90���� : A
		89-80���� : B
		79~ 70���� : C
		69~ 60���� : D
		59���� F */
		
		int i = 87;		
		if( i > 90) {
			System.out.println("A");			
	}
		else if ( i < 89) {
		System.out.println("B");
		}
		
		else if ( i < 79) {
			System.out.println("C");
		}
		else if ( i < 69) {
			System.out.println("D");
		}
		else if ( i < 59) {
			System.out.println("F");
		}
	
			
		}

}
