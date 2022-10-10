package array;


/* 학생 수강 과목 학점 출력
 * moon 학생은 두 과목을 수강하고 ,jo 학생은 세 과목을 수가암
 * 각 학생의 학점과 총점을 아래 같이 출력
 * student 클래스에 ArrayList 멤버변수 하나가지고 각 학생이 수강하는 과목을 관리해라*/
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
