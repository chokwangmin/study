package collection.treeset;



public class MemberTreeSetTest {

	public static void main(String[] args) {


		MemberTreeSet manager = new MemberTreeSet();
		
		Member member1 = new Member(100, "�̼���");
		Member member2 = new Member(200, "������");
		Member member3 = new Member(300, "������");
		Member member4 = new Member(100, "�̼���");
		
		manager.addMember(member1);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		
		manager.showAllMember();

	}

}
