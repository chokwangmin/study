package school;

public class TakeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//학생 만들기
		Student moon = new Student("문성재", 10000, 3);
		Student jo = new Student("조광민", 15000, 2);
		Student park = new Student("박아무개", 4000, 1);
		//Student.SchoolName
		System.out.println("----------");
		
	//학생정보
		moon.showInfo();
		jo.showInfo();
		park.showInfo();
	//버스 만들기
	Bus bus100 = new Bus(100);
	Subway subwayGreen = new Subway(2);
	
	//버스 지하철 정보보기
	bus100.showBus();
	subwayGreen.showSubwayInfo();
	System.out.println("----------");
	
	//jo 지하철 타자
	jo.takeSubway(subwayGreen);
	
	//park은 버스,지하철 탐
	park.takeSubway(subwayGreen);
	park.takeBus(bus100);
	// moon 버스 100번 타자
	moon.takeBus(bus100);	

	//학생정보
	moon.showInfo();
	jo.showInfo();
	System.out.println("----------");
	
	//버스,지하철 정보보가ㅣ
	
	bus100.showBus();
	subwayGreen.showSubwayInfo();
	System.out.println("----------");	
}
}
