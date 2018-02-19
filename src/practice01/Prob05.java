package practice01;

import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (n < 10) {
			// 1의자리인 경우
			if (n % 3 == 0) {
				System.out.println("짝");
			}
		} else if (n < 100) {
			// 두자리수인 경우
			int num_1 = n % 10; // 1의 자리수
			int num_10 = n / 10; // 10의 자리수
			// System.out.println(num_1+" "+num_10);
			if (num_10 % 3 != 0 && num_1 % 3 == 0) { // 경우 a : 13 같은 경우
				System.out.println("짝");
			} else if (num_10 % 3 == 0 && num_1 % 3 != 0) { // 경우 b : 31같은 경우
				System.out.println("짝");
			} else if (num_10 % 3 == 0 && num_1 % 3 == 0) { // 경우 c : 33같은 경우
				System.out.println("짝짝");
			}
		}

		scanner.close();
	}

}
