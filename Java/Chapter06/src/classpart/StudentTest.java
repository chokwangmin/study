package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kwangMin = new Student();		
		kwangMin.studentID = 1;
		kwangMin.studentName = "������";
		kwangMin.address = "�ϳ�";
		System.out.println(kwangMin.getStudentName());
		
		Student sungJae = new Student();
		sungJae.studentID = 2;
		sungJae.studentName = "������";
		sungJae.address = "�ϻ�";
		
		kwangMin.showStudentInfo();
		sungJae.showStudentInfo();
		
		

	}

}
