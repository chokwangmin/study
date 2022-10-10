package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studnet moon = new student(1000, "문성재");
		
		moon.studentID = 222;
		moon.setKoreSubject("국어", 100);
		moon.setKoreaSubject("수학", 95);
		Student jo = new student(1100, "조광민");
		jo.setKoreSubject("국어", 80);
		jo.setKoreSubject("수학", 70);
		
		
		moon.showStudentScore();
		jo.showStudentScore();
	}

}
