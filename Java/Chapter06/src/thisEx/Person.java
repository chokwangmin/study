package thisEx;

public class Person {

	String name;
	int age;
	this("이름없음",0);
}
	public Person() {
		this(name, age);
	}
	
	public Person(String name, int age) {
	this.name = name;
	this.age = age;
	}
	public void showInfo() {
		System.out.println(name + "," + age);
	}
}
