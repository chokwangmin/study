package template;

public class AICar extends Car{


	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 전환 합니다.");	
	}


	public void stop() {
		System.out.println("주변 사물을 인식하여 스스로 정지 합니다.");
		
	}


	@Override
	public void washCar() {
	System.out.println("자동차가 스스로 세타를 합니다");
	}

}
