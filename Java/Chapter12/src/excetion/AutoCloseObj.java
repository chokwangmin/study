package excetion;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("�� �ڵ����� �ݾҾ��");
		
	}
	
	public void info() {
		System.out.println("���� ����Ͻÿ�");
	}

}
