package array;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student moon = new Student(1001, "������");
		Student jo = new Student(1002, "������");
				
				//�л� ���� ����
				
				moon.addSubject("����", 100);
				moon.addSubject("����", 50);
				
				//���� ����
				jo.addSubject("html", 100);
				jo.addSubject("�ڹ�", 30);


				moon.showStudentInfo();
				jo.showStudentInfo();
	}

}
