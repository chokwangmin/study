package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kwangMin = new Student();		
		kwangMin.studentID = 1;
		kwangMin.studentName = "¡∂±§πŒ";
		kwangMin.address = "«œ≥≤";
		System.out.println(kwangMin.getStudentName());
		
		Student sungJae = new Student();
		sungJae.studentID = 2;
		sungJae.studentName = "πÆº∫¿Á";
		sungJae.address = "¿œªÍ";
		
		kwangMin.showStudentInfo();
		sungJae.showStudentInfo();
		
		

	}

}
