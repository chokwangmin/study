package excetion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void main(String[] args) {
		try (FileInputStream fs = new FileInputStream("a.txt")){
			
		}catch(Exception e) {
			
		}
		
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ��");
	}
	
}