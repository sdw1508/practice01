package practice01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");		
		int n = scanner.nextInt();
		if(n%3==0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		scanner.close();
	}
}
