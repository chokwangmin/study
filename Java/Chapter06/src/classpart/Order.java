package classpart;

public class Order {

	/*
	- �ֹ���ȣ
	- �ֹ��� ���̵�
	- �ֹ���¥
	- �ֹ��� �̸�
	- �ֹ���ǰ ��ȣ
	- ����ּ�
	
	+ �ֹ����� ���
	 >> �ֹ���ȣ : 1111 , ��ǰ��ȣ : 22222 , ����ּ� : ����...
	 */
	
	
	public int ordNm;
	public String id;
	public String ordyd;
	public String userName;
	public String prdNo;
	public String address;
	public void showOders() {
		System.out.println("�ֹ���ȣ" + ordNm + "," + "id: " + id + "," + "�ֹ���¥" + ordyd +"," + "�ֹ����̸�" + userName
				+ "," + "�ֹ���ǰ��ȣ" + prdNo + "," + "����ּ�"+ address);	
	}
}


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
