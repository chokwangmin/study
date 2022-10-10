package classpart;

public class Order {

	/*
	- 주문번호
	- 주문자 아이디
	- 주문날짜
	- 주문자 이름
	- 주문상품 번호
	- 배송주소
	
	+ 주문정보 출력
	 >> 주문번호 : 1111 , 상품번호 : 22222 , 배송주소 : 평촌...
	 */
	
	
	public int ordNm;
	public String id;
	public String ordyd;
	public String userName;
	public String prdNo;
	public String address;
	public void showOders() {
		System.out.println("주문번호" + ordNm + "," + "id: " + id + "," + "주문날짜" + ordyd +"," + "주문자이름" + userName
				+ "," + "주문상품번호" + prdNo + "," + "배송주소"+ address);	
	}
}


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
