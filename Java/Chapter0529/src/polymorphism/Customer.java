package polymorphism;

public class Customer {

	private int customerID;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	protected double bonusRatio;

	
//	public Customer() {
//		this.customerGrade = "SILVER";
//		this.bonusRatio = 0.01;
//		
//	}


	public int getCustomerID() {
		return customerID;
	}

	public int calcPrice(int price) {
	bonusPoint += price * bonusRatio;
	return price;
	}
	
	public String shownCustomerInfo() {
		return customerName + "���� �����" + customerGrade + "�̸�, ������ ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�";
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustmomerGrade() {
		return customerGrade;
	}


//	public void setcustomerGrade(String customerGrade) {
//		this.customerGrade = customerGrade;
//		this.bonusRatio= 0.01;
//		System.out.println("Customer() �⺻�����ڰ� ȣ��");
//	}
	
	public Customer(int custID, String custName) {
		this.customerID =custID;
		this.customerName = custName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		System.out.println("Customer(int, String)) ������ ȣ��");
		
	}
}
