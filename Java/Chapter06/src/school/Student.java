package school;

public class Student {

	private String name;  //�л��̸�
	private int grade; //�г�
	private int money; // ������
	public static String SchoolName = "Ʈ���̾�Ŭ";
	//������
	public Student(String studentName, int money, int grade) {
		this.name = studentName;
		this.money = money;
		this.grade = grade;
	}
	
	//����ź��.
	public void takeBus(Bus bus) {
	bus.take(Price.BUSPRICE);
	this.money -= Price.BUSPRICE;
	}
	
	//����ö ź��

	public void takeSubway(Subway subway) {
		subway.take(Price.SUBWAYPRICE);
	this.money -= Price.SUBWAYPRICE;
	}
	
	
	public void showInfo() {
	System.out.println(name + "���� ���� ���� " + money + "�� �Դϴ�.");
}
}
