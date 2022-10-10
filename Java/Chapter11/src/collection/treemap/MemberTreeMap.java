package collection.treemap;

import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	//회ㅝㄴ추가
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
		
	}
	
	//회원 제거
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 존재하지 않습니다");
		return false;
	}
	
	//전체회원 보기
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
}
