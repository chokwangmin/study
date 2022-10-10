package excetion;

public class IDFormatTest {
	
	private String userID;
	

	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException  {
		
		if(userID == null) {
			throw new IDFormatException("���̵�� null �ϼ� �����ϴ�.");
		}else if(userID.length() < 8) {
			throw new IDFormatException("���̵�� 8�� �̻� �̿��� �մϴ�.");
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