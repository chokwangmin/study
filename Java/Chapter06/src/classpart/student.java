package classpart;


/* 학생 클래서 정의
 학생
 -학번,이름,주소
  + 학생의 정보를 출력하는 기능
 */




public class student {
	//멤버 변수
	public	int studentID;
	public String studentName;
	public	String address;
	//기능 (메소드)
	public void showStudentInfo() {
		System.out.println("학번:" + studentID + "," + "이름: " + studentName + "," + "주소" + address);
		
	}
	
	//학생 이름을 출력하는 기능
	public String getStudentName() {
		return studentName;
	}
	
		
}

