package practice01;

public class Prob02 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = i; j < 10 + i; j++) {
				System.out.print(j);
				if (j < (10 + i - 1)) { //띄어쓰기
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
