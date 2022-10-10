package operator;

public class OperatorEX1 {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		int num1 = -10;
		int num2 = 20;
		System.out.println(-num1);
		System.out.println(-num2);
	}*/
	
	int score = 100;
	System.out.println(++score);
	
	int score2 = 200;
	System.out.println(score++);

//관계연산자
		
		//논리연산자
		//&& , ||, ! 
		//단락 회로평가
		//참,거짓
	 	int no1 = 10;
		int i = 2;
		boolean value =  ((no1 = no1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(no1); 
		
		//삼항연산자
		
		
		
		//비트연산자 0101010101..
		/*
		~ : 비ㅣ트의 반전 (1의 보수)
		& : 비트단위 and
		| : 비트단위 or
		^ : 비트단위 xor ㄷ개의비트가 서로다른 경우에는 1을반환
		<< 왼/쪽 shift a << 1 a를 2비트 만큼 왼쪽으로 이동
		>> 오른쪽 shift a>> 1 a를 2비트 만큼 오른쪽으로 이동
		>>> : 오른쪽 shift 
		*/
		
		int bNum1 = 0B00001010; //10
		int bNum2 = 0B00000101; // 5
		System.out.println(bNum1 & bNum2);
		System.out.println(bNum1 | bNum2);
		
	}
	} 