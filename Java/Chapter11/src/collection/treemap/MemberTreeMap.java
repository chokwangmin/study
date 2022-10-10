package collection.treemap;

import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	//ȸ�ͤ��߰�
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
		
	}
	
	//ȸ�� ����
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ�� ��ȣ�� �������� �ʽ��ϴ�");
		return false;
	}
	
	//��üȸ�� ����
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
}