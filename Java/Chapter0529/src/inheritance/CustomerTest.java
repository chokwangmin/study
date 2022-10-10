package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer moon = new Customer(10010, "¹®¼ºÀç");
		//moon.setCustomerName("¹®¼ºÀç");
		//moon.setCustomerID(10010);
		moon.bonusPoint = 1000;
		System.out.println(moon.shownCustomerInfo());
		
		VIPCustomer jo = new VIPCustomer(10020, "Á¶±¤¹Î");
		//jo.setCustomerName("Á¶±¤¹Î");
		//jo.setCustomerID(10020);
		jo.bonusPoint = 1000;
		System.out.println(jo.shownCustomerInfo());
			
	}

}
