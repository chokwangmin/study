package template;
/*fanal 에약어
  final 변수는 값이 변경될수 없는 상수
  public static fanal double pro =3.14;
  오직 하번만 값을 할당
  
  final 메서드는 하위 클래스에서 재정의(overriding 할수 없음
  final 클래스는 더이상 상속되지 않음,
  예) String - java클래스
  */


public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void trunOff() {
		System.out.println("시동을 끕니다");
	}
	
	public void washCar() {};
	final public void run() { //템플릿 메서드
		startCar();
		drive();
		stop();
		trunOff();
		washCar();
	}
}
