package polymorphism;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() ������ ȣ��");
	
	public VIPCustomer(int custID, String custName) {
		
		
		super(custID, custName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");	
	}
	//������̼�(annotation)
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}

