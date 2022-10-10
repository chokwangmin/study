package excetion;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("나 자동으로 닫았어요");
		
	}
	
	public void info() {
		System.out.println("나를 사용하시오");
	}

}
