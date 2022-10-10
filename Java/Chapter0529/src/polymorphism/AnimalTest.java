package polymorphism;

import java.util.ArrayList;

/*
 ������ (poly...)
 �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
 
 ��������,��Ӱ� ���Ҿ� ��ü���� ���α׷����� ���� ū Ư¡ �� �ϳ�
 ��ü���� ���α׷��� ������, ��Ȱ�뼺, ������������ �⺻�� �Ǵ� Ư¡
 
 �������� ���O�Կ� �־� ����
 
 >> �پ缺 ����Ŭ������ �ϳ��� �ڷ���( ���� Ŭ����)���� �����ϰų� ����ȯ �Ͽ� �� Ŭ������
 ������ �޼����� �������̵� ��, ��� �ϳ��� �ڵ尡 �پ��� ������ �����Ҽ��ִ�.
 
 �� �ڷ��� ���� �ٸ� �޼��带 ȣ������ �������� �ڵ�� ���� if���� �����,
 
- 0612. ������
- �߻�Ŭ����
- �������̽�
 */

class Animal{
	public void move() {
		System.out.println("������ �����δ�");;
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{

	@Override
	public void move() {
	System.out.println("ȣ���̴� �� �߷� �ݴϴ�");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
	System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ ��� ���� ���ϴ�");
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
				System.out.println("����");
			}
		}
	}
	}
