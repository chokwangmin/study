package interfaceex;
/*
인터페이스 
- 상수 ( 선언돈 모든 변수는 상수)
- 메서드 (추상메서드)

-java8
-디폴트 메서드
-정적 메서드
java9
-prtivate 메서드
*/

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("점수 게산기를 구현합니다");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}

	//public String stringAdd(String s1, String s2);
	
	
	
}
