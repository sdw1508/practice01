package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = scanner.nextInt(); // 입력받음
		int sum = 0;
		if (n % 2 == 0) { // 짝수\
			sum = 0;
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
		} else {// 홀수
			sum = 0;
			for (int i = 0; i <= n; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
			}
		} // else
		System.out.println("결과 값 : " + sum);
		scanner.close();
	}

}
