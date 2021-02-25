package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J_1093_이상한출석 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int tmp[] = new int[24];

		String temp = br.readLine();
		StringTokenizer st = new StringTokenizer(temp, " ");

		for (int i = 0; i < N; i++) {
			tmp[Integer.parseInt(st.nextToken())]++;
		}

		for (int i = 1; i < tmp.length; i++) {
			System.out.print(tmp[i] + " ");
		}
	}

}
