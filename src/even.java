import java.util.Scanner;

public class even {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input:");
		int in = scanner.nextInt();

		for (int i = 2; i <= in;) {
			if (in % i == 0) {
				if (in == i) {
					System.out.print(i);
				} else
					System.out.print(i + "*");
				in = in / i;
			} else
				i = i + 1;
		}
	}
}