package school;

public class Bus {
	
	private int busNumber; //버스번호
	private int passengerCount; // 승객수
	private int money;             //수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승차
	public void take(int money) {
	this.money += money;
	passengerCount++;   // passengerCount = passengerCount +1;
	}
	
	public void showBus() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고 수입은 " + money + "입니다." );
	}
}

