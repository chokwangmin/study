package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	
	public void Stundent(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	public void setKoreSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
		
		
	}
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총정은" + total + "점 입니다.");
	}
	
}
