package polymorphism;

public class CustomerTest{

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Customer moon = new Customer(10010, "������");
	//moon.setCustomerName("������");
	//moon.setCustomerID(10010);
	moon.bonusPoint = 1000;
	System.out.println(moon.shownCustomerInfo());
	
	VIPCustomer jo = new VIPCustomer(10020, "������");
	//jo.setCustomerName("������");
	//jo.setCustomerID(10020);
	jo.bonusPoint = 1000;
	System.out.println(jo.shownCustomerInfo());
	
	
	Customer lee = new GoldCustomer(10030, "ȫ�⵿");
	
	lee.bonusPoint = 1000;
	lee.calcPrice(500);
	System.out.println(lee.shownCustomerInfo());
		
}

}
