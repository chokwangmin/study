package reference;

public class MyDate {
	private boolean isVal = true;

	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}

	public void setMonth(int month) {
		if (month < 1 || month >  12) {
		System.out.println("���� 13���� �۾ƾ� �մϴ�.");
		isVal = false;
	}
		else {
		this.month = month;
		}
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showMyDate() {
		if(isVal)
		System.out.println("�� : " + year + "�� :"  + month + " : ��" + day);
		
	} 
}
