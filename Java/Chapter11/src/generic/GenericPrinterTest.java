package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
//프린터 준비
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		//재료준비
		Powder powder =new Powder();
		
		//재료 프린터기에 넣음
		powderPrinter.setMaterial(powder);
		
		//프린터 확인
		System.out.println(powderPrinter);
		
		powderPrinter.print();
		
		//프린터 준비
				GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
				
				//재료준비
				Plastic plastic =new Plastic();
				
				//재료 프린터기에 넣음
				plasticPrinter.setMaterial(plastic);
				
				//프린터 확인
				System.out.println(plasticPrinter);
				
				plasticPrinter.print();
	}

}
