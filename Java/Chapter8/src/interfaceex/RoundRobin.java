package interfaceex;

public class RoundRobin implements Schedule{

	@Override
	public void getNextCall() {
	System.out.println("��� ��ȭ�� ������� ��������");
		
	}

	@Override
	public void sendCallToAgent() {
	System.out.println("���� ������ �������� ����Ѵ�.");
		
	}

}
