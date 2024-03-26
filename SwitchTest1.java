package chapter;

import java.util.Scanner;

/*
 *202195057  손패택
 *컴퓨터공학
 */
public class SwitchTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("월를 입력:");
		int month = stdIn.nextInt();
		
		switch(month)
		{
		case 3 : case 4 : case 5 :
			System.out.print("봄입니다.");	
		case 6 : case 7 : case 8 :
			System.out.print("여름입니다.");
		case 9 : case 10 : case 11 :
			System.out.print("가올입니다.");
		case 12 : case 1 : case 2 :
			System.out.print("겨올입니다.");
		default :
			System.out.print("해당 월은 없슴니다.");
			break;
			}
	}

}
