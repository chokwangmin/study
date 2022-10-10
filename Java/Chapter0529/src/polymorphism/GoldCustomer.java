package polymorphism;

public class GoldCustomer extends Customer {
	double salesRatio;
	public GoldCustomer(int custID, String custName) {
		super(custID, custName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;

	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int) (price*salesRatio);
	}

}
