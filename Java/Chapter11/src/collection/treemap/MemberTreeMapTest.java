package collection.treemap;


public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		
		Member member1 = new Member(200, "±è¼ø½Å");
		Member member2 = new Member(300, "À¯°ü¼ø");
		Member member3 = new Member(100, "À±ºÀ±æ");
		Member member4 = new Member(100, "ÀÌ¼ø½Å");
		
		manager.addMember(member1);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		
		manager.showAllMember();
		manager.removeMember(200);
		manager.showAllMember();

	}

}
