package interfaceex;

import java.io.IOException;

public class ScheduleTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담원 할당 방식을 선택하세요");
		System.out.println("R :한명씩 차례대로");
		System.out.println("L :대기가 적은 상담원 우선");
		System.out.println("P :우선순위가 높은 고객 순력도 높은 상담원");
		
		int ch = System.in.read();
		Schedule schedule = null;
		
		if(ch == 'R')
			schedule = new RoundRobin();
		else if (ch == 'L')
			schedule = new Leastjob();
		else if (ch == 'p')
			schedule = new PriorityAllcation();
		else {
				System.out.println("지원하지 않는 기능입니다");
				return;
				
			}
		schedule.getNextCall();
		schedule.sendCallToAgent();
		
	}

}
