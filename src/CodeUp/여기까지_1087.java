package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 여기까지_1087 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int temp = 0;
		br.close();

		for (int i = 0;; i++) {

			temp += i;
			if (N <= temp) {
				System.out.println(temp);
				break;
			}

		}

	}

}
