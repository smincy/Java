package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ∞‘¿”ø’_1083 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {

			if (i % 3 == 0) {
				System.out.print("X ");
				System.out.print(" ");
			} else {
				System.out.print(i);
				System.out.print(" ");
			}

		}

	}

}
