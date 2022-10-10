package loopEx;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 1;
//		int sum = 0;
//		while(num <= 10) {
//			sum = sum + num;
//			num++;
//		}
//		System.out.println(sum);
//		System.out.println(num);
		int input;
		int sum = 0;
		do {
			Scanner scn = new Scanner(System.in);
		 input = scn.nextInt();
		 
		 sum = sum + input;
		 System.out.println(sum);
		}
		while (input != 0) ;
		}
		}
	

