package gameLevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달린다");
		
	}

	@Override
	public void jump() {
		System.out.println("빨리 점프한다");
		
	}

	@Override
	public void trun() {
		System.out.println("빨리 회전한다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==중급 레벨 입니다.==");
		
	}

}
