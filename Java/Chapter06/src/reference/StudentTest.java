package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studnet moon = new student(1000, "������");
		
		moon.studentID = 222;
		moon.setKoreSubject("����", 100);
		moon.setKoreaSubject("����", 95);
		Student jo = new student(1100, "������");
		jo.setKoreSubject("����", 80);
		jo.setKoreSubject("����", 70);
		
		
		moon.showStudentScore();
		jo.showStudentScore();
	}

}
