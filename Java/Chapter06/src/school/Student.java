package school;

public class Student {

	private String name;  //학생이름
	private int grade; //학년
	private int money; // 가진돈
	public static String SchoolName = "트라이씨클";
	//생성자
	public Student(String studentName, int money, int grade) {
		this.name = studentName;
		this.money = money;
		this.grade = grade;
	}
	
	//버스탄다.
	public void takeBus(Bus bus) {
	bus.take(Price.BUSPRICE);
	this.money -= Price.BUSPRICE;
	}
	
	//지하철 탄다

	public void takeSubway(Subway subway) {
		subway.take(Price.SUBWAYPRICE);
	this.money -= Price.SUBWAYPRICE;
	}
	
	
	public void showInfo() {
	System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
}
}
