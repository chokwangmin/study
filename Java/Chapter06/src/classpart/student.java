package classpart;


/* �л� Ŭ���� ����
 �л�
 -�й�,�̸�,�ּ�
  + �л��� ������ ����ϴ� ���
 */




public class student {
	//��� ����
	public	int studentID;
	public String studentName;
	public	String address;
	//��� (�޼ҵ�)
	public void showStudentInfo() {
		System.out.println("�й�:" + studentID + "," + "�̸�: " + studentName + "," + "�ּ�" + address);
		
	}
	
	//�л� �̸��� ����ϴ� ���
	public String getStudentName() {
		return studentName;
	}
	
		
}

