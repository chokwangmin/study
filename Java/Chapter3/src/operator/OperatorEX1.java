package operator;

public class OperatorEX1 {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		int num1 = -10;
		int num2 = 20;
		System.out.println(-num1);
		System.out.println(-num2);
	}*/
	
	int score = 100;
	System.out.println(++score);
	
	int score2 = 200;
	System.out.println(score++);

//���迬����
		
		//��������
		//&& , ||, ! 
		//�ܶ� ȸ����
		//��,����
	 	int no1 = 10;
		int i = 2;
		boolean value =  ((no1 = no1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(no1); 
		
		//���׿�����
		
		
		
		//��Ʈ������ 0101010101..
		/*
		~ : ���Ʈ�� ���� (1�� ����)
		& : ��Ʈ���� and
		| : ��Ʈ���� or
		^ : ��Ʈ���� xor �����Ǻ�Ʈ�� ���δٸ� ��쿡�� 1����ȯ
		<< ��/�� shift a << 1 a�� 2��Ʈ ��ŭ �������� �̵�
		>> ������ shift a>> 1 a�� 2��Ʈ ��ŭ ���������� �̵�
		>>> : ������ shift 
		*/
		
		int bNum1 = 0B00001010; //10
		int bNum2 = 0B00000101; // 5
		System.out.println(bNum1 & bNum2);
		System.out.println(bNum1 | bNum2);
		
	}
	} 