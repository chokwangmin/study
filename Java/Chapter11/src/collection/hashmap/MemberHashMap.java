package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//회ㅝㄴ추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
		
	}
	
	//회원 제거
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 존재하지 않습니다");
		return false;
	}
	
	//전체회원 보기
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
