package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_1094_이상한출석2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] tmp = new int[N];

		String temp = br.readLine();

		StringTokenizer st = new StringTokenizer(temp, " ");

		for (int i = 0; i < N; i++) {
			tmp[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = tmp.length-1; 0 <= i; i--) {
			System.out.print(tmp[i] + " ");
		}
		
	}

}
