package generic;

public class Plastic extends Powder{

	@Override
	public String toString() {

		return "재료는 플라스틱 입니다.";
	}

	@Override
	public void doPrint() {
		System.out.println("플라스틱으로 프린팅 합니다");
	}
	
	

}
