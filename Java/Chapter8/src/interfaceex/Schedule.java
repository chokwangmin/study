package interfaceex;

/*
 인터페이스 다형성
  - 고객센터 전화상담 전화오면 대기열 저장
  - 상담원에게 배분 정책 구현
  
  [배분 정책]
  - 상담원 순서대로 배분
  - 대기가 짧은 상담원 먼저 배분
  - 우선순위가 높은(숙력도 높은)상담원에게 배분
  
  위와 같이 다양한 정책이 사용되는 interface를 정의하고 다양한 정책을 구혀하여 실행하라.
  
  인터페이스 
  - 상수 ( 선언돈 모든 변수는 상수)
  - 메서드 (추상메서드)
  
  -java8
  -디폴트 메서드
  -정적 메서드
  java9
  -prtivate 메서드
  
 */
public interface Schedule {
	
	//클레임 가져오기
	public void getNextCall();
	//상담 배분하기
	public void sendCallToAgent();
	

}
