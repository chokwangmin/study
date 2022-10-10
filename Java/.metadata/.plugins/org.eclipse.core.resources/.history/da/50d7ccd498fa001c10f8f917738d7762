package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	
	private TreeSet<Member> treeset;
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	//회원 지우기
	public boolean removeMeber(int memberId) {
		
		Iterator<Member> ir = treeset.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeset.remove(member);
				return true;
				
			}
			
		}
		System.out.println("해당 번호의 멤버는 없습니다.");
		return false;
	}
	//회원 전체 보여주기
	public void showAllMember() {
		for(Member member : treeset) {
			System.out.println(member);
		}
	}
	
	

}
