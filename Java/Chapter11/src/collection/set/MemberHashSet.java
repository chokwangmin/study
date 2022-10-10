package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//회원 지우기
	public boolean removeMeber(int memberId) {
		
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
				
			}
			
		}
		System.out.println("해당 번호의 멤버는 없습니다.");
		return false;
	}
	//회원 전체 보여주기
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
	}
	
	

}
