package interfaceex;
/*
�������̽� 
- ��� ( ���� ��� ������ ���)
- �޼��� (�߻�޼���)

-java8
-����Ʈ �޼���
-���� �޼���
java9
-prtivate �޼���
*/

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� �Ի�⸦ �����մϴ�");
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
