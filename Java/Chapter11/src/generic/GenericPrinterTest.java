package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
//������ �غ�
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		//����غ�
		Powder powder =new Powder();
		
		//��� �����ͱ⿡ ����
		powderPrinter.setMaterial(powder);
		
		//������ Ȯ��
		System.out.println(powderPrinter);
		
		powderPrinter.print();
		
		//������ �غ�
				GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
				
				//����غ�
				Plastic plastic =new Plastic();
				
				//��� �����ͱ⿡ ����
				plasticPrinter.setMaterial(plastic);
				
				//������ Ȯ��
				System.out.println(plasticPrinter);
				
				plasticPrinter.print();
	}

}