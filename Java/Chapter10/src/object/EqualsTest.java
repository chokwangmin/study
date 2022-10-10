package object;

class Student {
	int studentNum;
	String studentName;
	public Student(int num, String name) {
		this.studentNum = num;
		this.studentName = name;
	}
}
public class EqualsTest {

	public static void main(String[] args) {
		
//		Student lee = new Student (100, "이순신");
//		Student lee2 = lee;
//		Student shin = new Student(100, "이순신");
//		System.out.println( lee == shin);
//		System.out.println(lee.equals(shin));
//				
	


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student) obj;
			return (this.studentNum)
		}
	}
	
	Integer i1 = new Integer(100);
	Integer i2 = new Integer(100);
	System.out.println(i1.equals(i2));
	

//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		String str3 = "abc";
//		String str4 = "abc";
//		
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
//		System.out.println(str3 == str4);
//		System.out.println(str3.equals(str4));
//	}
	}
}
