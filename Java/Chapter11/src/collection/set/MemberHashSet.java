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
	
	//ȸ�� �����
	public boolean removeMeber(int memberId) {
		
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
				
			}
			
		}
		System.out.println("�ش� ��ȣ�� ����� �����ϴ�.");
		return false;
	}
	//ȸ�� ��ü �����ֱ�
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
	}
	
	

}