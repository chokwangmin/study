package template;

public class ManualCar extends Car{


	public void drive() {
		System.out.println("사람이 운전을 합니다");
		System.out.println("사람이 방향을 바꿉니다");
	}


	public void stop() {
		System.out.println("사람이 브레이크를 밞아서 정지합니다.");
		
	}
}