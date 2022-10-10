package gameLevel;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("겁나 빨ㄹ 달린다");
		
	}

	@Override
	public void jump() {
		System.out.println("겁나 빨리 점프한다");
		
	}

	@Override
	public void trun() {
		System.out.println("겁나 빨리 회전한다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==고급자 레벨 입니다.==");
		
	}

}
