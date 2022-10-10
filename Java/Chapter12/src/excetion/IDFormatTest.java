package excetion;

public class IDFormatTest {
	
	private String userID;
	

	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException  {
		
		if(userID == null) {
			throw new IDFormatException("아이디는 null 일수 없습니다.");
		}else if(userID.length() < 8) {
			throw new IDFormatException("아이디는 8자 이상 이여야 합니다.");
		}
	}


	public static void main(String[] args) {

		IDFormatTest idTest = new IDFormatTest();
		
		String id = "12345";
		try {
			idTest.setUserID(id);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
