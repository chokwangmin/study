package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서 제공되는 객체 배열 구현된 클래스
		//객체 배열을 사용하는데 필요한 여러 메세드들이 구현되어있음
		//add(0,size() , get() , remove() isEmpty()
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		for(int i=0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		for(String s : list) {
		System.out.println(s);
		}

	}

}
