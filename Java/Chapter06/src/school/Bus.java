package school;

public class Bus {
	
	private int busNumber; //������ȣ
	private int passengerCount; // �°���
	private int money;             //����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//����
	public void take(int money) {
	this.money += money;
	passengerCount++;   // passengerCount = passengerCount +1;
	}
	
	public void showBus() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "�� �̰� ������ " + money + "�Դϴ�." );
	}
}

