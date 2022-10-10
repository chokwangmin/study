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

	//�������� ���� ����
	
	public void addSubject(String name, int score) {
		//�������
		Subject subject = new Subject(name, score);
		//���񸮽�Ʈ �߰�
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + " �л���" + subject.getName() + "������ ������ " + subject.getScore() + " �� �Դϴ�.");
		}
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
		
	}
}
