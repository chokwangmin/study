package template;
/*fanal �����
  final ������ ���� ����ɼ� ���� ���
  public static fanal double pro =3.14;
  ���� �Ϲ��� ���� �Ҵ�
  
  final �޼���� ���� Ŭ�������� ������(overriding �Ҽ� ����
  final Ŭ������ ���̻� ��ӵ��� ����,
  ��) String - javaŬ����
  */


public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	public void trunOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	public void washCar() {};
	final public void run() { //���ø� �޼���
		startCar();
		drive();
		stop();
		trunOff();
		washCar();
	}
}
