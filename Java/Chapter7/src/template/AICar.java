package template;

public class AICar extends Car{


	public void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ ��ȯ �մϴ�.");	
	}


	public void stop() {
		System.out.println("�ֺ� �繰�� �ν��Ͽ� ������ ���� �մϴ�.");
		
	}


	@Override
	public void washCar() {
	System.out.println("�ڵ����� ������ ��Ÿ�� �մϴ�");
	}

}
