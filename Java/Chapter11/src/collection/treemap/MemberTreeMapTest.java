package collection.treemap;


public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		
		Member member1 = new Member(200, "??????");
		Member member2 = new Member(300, "??????");
		Member member3 = new Member(100, "??????");
		Member member4 = new Member(100, "?̼???");
		
		manager.addMember(member1);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		
		manager.showAllMember();
		manager.removeMember(200);
		manager.showAllMember();

	}

}
