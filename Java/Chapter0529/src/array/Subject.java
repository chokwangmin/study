package array;


/* �л� ���� ���� ���� ���
 * moon �л��� �� ������ �����ϰ� ,jo �л��� �� ������ ������
 * �� �л��� ������ ������ �Ʒ� ���� ���
 * student Ŭ������ ArrayList ������� �ϳ������� �� �л��� �����ϴ� ������ �����ض�*/
public class Subject {

	private String name;
	private int Score;
	
	public Subject(String name, int score) {
		this.name = name;
		this.Score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	} 
	
	
}
