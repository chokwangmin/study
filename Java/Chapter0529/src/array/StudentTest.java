package array;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student moon = new Student(1001, "문성재");
		Student jo = new Student(1002, "조광민");
				
				//학생 과목 셋팅
				
				moon.addSubject("국어", 100);
				moon.addSubject("수학", 50);
				
				//과목 셋팅
				jo.addSubject("html", 100);
				jo.addSubject("자바", 30);


				moon.showStudentInfo();
				jo.showStudentInfo();
	}

}
