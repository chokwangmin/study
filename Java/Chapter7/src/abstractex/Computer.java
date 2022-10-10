
/* 추상클래스
 
 */
package abstractex;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();

	//켠다
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	
	//끈다
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
