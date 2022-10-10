package gameLevel;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void trun();
	public abstract void showLevelMessage();
	
	//���ø� �޼���
	final public void go ( int count) {
		run();
		//���ڸ�ŭ �����ϰ�
		for(int i =0; i<count; i++) {
			jump();
		}
		//ȸ���ϰ�
		trun();
	}

}
