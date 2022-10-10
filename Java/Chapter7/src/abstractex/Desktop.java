package abstractex;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("데스크탑 별도 모니터 표시");
		
	}

	@Override
	public void typing() {
		System.out.println("데스트탑 별도 키보드 타이핑");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("데스크탑 전원 끄기");
	}

}
