package array;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentid, String name) {
		this.studentID = studentid;
		this.studentName = name;
		this.subjectList = new ArrayList<Subject>();
	}

	//수강과목 학점 샛탕
	
	public void addSubject(String name, int score) {
		//과목생성
		Subject subject = new Subject(name, score);
		//과목리스트 추가
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + " 학생의" + subject.getName() + "과목의 성적은 " + subject.getScore() + " 점 입니다.");
		}
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
		
	}
}
