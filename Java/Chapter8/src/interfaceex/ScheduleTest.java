package interfaceex;

import java.io.IOException;

public class ScheduleTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R :�Ѹ� ���ʴ��");
		System.out.println("L :��Ⱑ ���� ���� �켱");
		System.out.println("P :�켱������ ���� �� ���µ� ���� ����");
		
		int ch = System.in.read();
		Schedule schedule = null;
		
		if(ch == 'R')
			schedule = new RoundRobin();
		else if (ch == 'L')
			schedule = new Leastjob();
		else if (ch == 'p')
			schedule = new PriorityAllcation();
		else {
				System.out.println("�������� �ʴ� ����Դϴ�");
				return;
				
			}
		schedule.getNextCall();
		schedule.sendCallToAgent();
		
	}

}
