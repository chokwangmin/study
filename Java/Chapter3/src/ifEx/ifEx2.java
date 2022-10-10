package ifEx;

public class ifEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적에 따른 학점 부여하기
		
		/* 100 - 90점은 : A
		89-80점은 : B
		79~ 70점은 : C
		69~ 60점은 : D
		59이하 F */
		
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
