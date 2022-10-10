package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer baseCustomer = new Customer(10010, "일반");
		baseCustomer.bonusPoint = 1000;
		System.out.println(baseCustomer.shownCustomerInfo());
	
		VIPCustomer kim = new VIPCustomer(10020, "VIP");
		kim.bonusPoint = 1000;
		System.out.println(kim.shownCustomerInfo());
		
		int priceBase = baseCustomer.calcPrice(10000);
		int priceVIP = kim.calcPrice(10000);
		System.out.println(baseCustomer.shownCustomerInfo());
		System.out.println(kim.shownCustomerInfo());
		System.out.println("base 지불금액 :" + priceBase);
		System.out.println("VIP 지불금액 :" + priceVIP);
	}

}
