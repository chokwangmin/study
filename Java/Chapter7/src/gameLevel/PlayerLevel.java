package gameLevel;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void trun();
	public abstract void showLevelMessage();
	
	//템플릿 메서드
	final public void go ( int count) {
		run();
		//숫자만큼 점프하고
		for(int i =0; i<count; i++) {
			jump();
		}
		//회전하고
		trun();
	}

}
