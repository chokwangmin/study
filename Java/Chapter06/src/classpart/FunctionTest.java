package classpart;

public class FunctionTest {

	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		
		return result;
	}
	
	public static void sayHello() {
		System.out.println("гоюл");
	}
	
	public static int calcSum() {
		int sum = 0;
		for(int i=0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 20;
		
		
		int result = addNum(10, 100);
		System.out.println(result);
		sayHello();
		
		int ret = calcSum();
		System.out.println(ret);
		
	}

}
