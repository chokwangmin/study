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
		return customerName + "님의 등급은" + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다";
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
//		System.out.println("Customer() 기본생성자가 호출");
//	}
	
	public Customer(int custID, String custName) {
		this.customerID =custID;
		this.customerName = custName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		System.out.println("Customer(int, String)) 생성자 호출");
		
	}
}
