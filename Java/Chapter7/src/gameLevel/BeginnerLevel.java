package gameLevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달린다");
		
	}

	@Override
	public void jump() {
		System.out.println("천천히 점프한다");
		
	}

	@Override
	public void trun() {
		System.out.println("천천히 회전한다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==초급자 레벨 입니다.==");
		
	}

}
