package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("Customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
		
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Customer order");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	
	

}
