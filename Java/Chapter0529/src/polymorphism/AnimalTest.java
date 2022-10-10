package polymorphism;

import java.util.ArrayList;

/*
 다형성 (poly...)
 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
 
 정보은닉,상속고 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나
 객체지향 프로그램의 유연성, 재활용성, 유지보수성에 기본이 되는 특징
 
 다형성의 사횽함에 있어 장점
 
 >> 다양성 여러클래스를 하나의 자료형( 상위 클래스)으로 선언하거나 형변환 하여 각 클래스가
 동일한 메서르를 오버라이딩 한, 경우 하나의 코드가 다양한 구현을 실행할수있다.
 
 각 자료형 마다 다른 메서드를 호출하지 않음으로 코드상 많은 if문의 사라짐,
 
- 0612. 다형성
- 추상클래스
- 인터페이스
 */

class Animal{
	public void move() {
		System.out.println("동물이 움직인다");;
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{

	@Override
	public void move() {
	System.out.println("호랑이는 네 발로 뜁니다");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
	System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아 갑니다");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		if(hAnimal instanceof Human) {
		Human human = (Human)hAnimal;
		human.readBook();
		}
		hAnimal.move();
		tAnimal.move();
		eAnimal.move();
		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
	
		ArrayList<Animal> listAnimal = new ArrayList<Animal>();
		listAnimal.add(hAnimal);
		listAnimal.add(tAnimal);
		listAnimal.add(eAnimal);
	
//		for(Animal animal : listAnimal) {
//			animal.move();
//		}
//		
	}
	public void moveAnimal (Animal animal) {
		animal.move();
	}
	
	public void testDownCast(ArrayList<Animal> list) {
		for( int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
				
			}else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("에러");
			}
		}
	}
	}
