package school;

public class Subway {
	
	private int lineNumber; //호선번호
	private int passengerCount; //승객수
	private int money; //수입
	
	
	//생성자
	public Subway(int lineNumber) {
	this.lineNumber = lineNumber;
}

	//승차
	public void take(int money){
		this.money += money;
		passengerCount++;
}
	
	//지하철 정보
	
	public void showSubwayInfo(){
		System.out.println(lineNumber + "호선 지하철의 승객은" + passengerCount + "명 이고 수입은 " + money + "원 입니다.");
	}

	
}