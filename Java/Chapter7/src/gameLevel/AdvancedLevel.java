package gameLevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� �޸���");
		
	}

	@Override
	public void jump() {
		System.out.println("���� �����Ѵ�");
		
	}

	@Override
	public void trun() {
		System.out.println("���� ȸ���Ѵ�");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==�߱� ���� �Դϴ�.==");
		
	}

}
