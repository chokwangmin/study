package interfaceex;

import java.util.ArrayList;

public class Shelf {

	//�����
	protected ArrayList<String> shelf;
	
	//������
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	//���� ���ǵ� ��������
	public ArrayList<String> getShelf(){
		return this.shelf;
	}
//���ݹ��� ����	
	public int getCount() {
		return shelf.size();
	}
	
}
