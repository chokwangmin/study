package school;

public class TakeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//�л� �����
		Student moon = new Student("������", 10000, 3);
		Student jo = new Student("������", 15000, 2);
		Student park = new Student("�ھƹ���", 4000, 1);
		//Student.SchoolName
		System.out.println("----------");
		
	//�л�����
		moon.showInfo();
		jo.showInfo();
		park.showInfo();
	//���� �����
	Bus bus100 = new Bus(100);
	Subway subwayGreen = new Subway(2);
	
	//���� ����ö ��������
	bus100.showBus();
	subwayGreen.showSubwayInfo();
	System.out.println("----------");
	
	//jo ����ö Ÿ��
	jo.takeSubway(subwayGreen);
	
	//park�� ����,����ö Ž
	park.takeSubway(subwayGreen);
	park.takeBus(bus100);
	// moon ���� 100�� Ÿ��
	moon.takeBus(bus100);	

	//�л�����
	moon.showInfo();
	jo.showInfo();
	System.out.println("----------");
	
	//����,����ö ����������
	
	bus100.showBus();
	subwayGreen.showSubwayInfo();
	System.out.println("----------");	
}
}
