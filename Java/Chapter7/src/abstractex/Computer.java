
/* �߻�Ŭ����
 
 */
package abstractex;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();

	//�Ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	
	//����
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
