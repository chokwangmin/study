package excetion;

public class AutoCloseTest {

	public static void main(String[] args) {

		try (AutoCloseObj obj = new AutoCloseObj()) {
			obj.info();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
