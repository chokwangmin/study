package school;

public class Subway {
	
	private int lineNumber; //ȣ����ȣ
	private int passengerCount; //�°���
	private int money; //����
	
	
	//������
	public Subway(int lineNumber) {
	this.lineNumber = lineNumber;
}

	//����
	public void take(int money){
		this.money += money;
		passengerCount++;
}
	
	//����ö ����
	
	public void showSubwayInfo(){
		System.out.println(lineNumber + "ȣ�� ����ö�� �°���" + passengerCount + "�� �̰� ������ " + money + "�� �Դϴ�.");
	}

	
}