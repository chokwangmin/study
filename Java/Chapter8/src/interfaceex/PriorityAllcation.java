package interfaceex;

public class PriorityAllcation implements Schedule {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 콜 먼저 가져오기");
		
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 숙련도가 높은 상담원에게 배분하기");
		
		
	}

}
