package interfaceex;

import java.util.ArrayList;

public class Shelf {

	//저장소
	protected ArrayList<String> shelf;
	
	//생성자
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	//선반 물건들 가져오기
	public ArrayList<String> getShelf(){
		return this.shelf;
	}
//선반물건 수량	
	public int getCount() {
		return shelf.size();
	}
	
}
