package interfaceex;

/*
 �������̽� ������
  - �������� ��ȭ��� ��ȭ���� ��⿭ ����
  - �������� ��� ��å ����
  
  [��� ��å]
  - ���� ������� ���
  - ��Ⱑ ª�� ���� ���� ���
  - �켱������ ����(���µ� ����)�������� ���
  
  ���� ���� �پ��� ��å�� ���Ǵ� interface�� �����ϰ� �پ��� ��å�� �����Ͽ� �����϶�.
  
  �������̽� 
  - ��� ( ���� ��� ������ ���)
  - �޼��� (�߻�޼���)
  
  -java8
  -����Ʈ �޼���
  -���� �޼���
  java9
  -prtivate �޼���
  
 */
public interface Schedule {
	
	//Ŭ���� ��������
	public void getNextCall();
	//��� ����ϱ�
	public void sendCallToAgent();
	

}