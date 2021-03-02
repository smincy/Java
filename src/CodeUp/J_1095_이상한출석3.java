package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J_1095_이상한출석3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int tmp[] = new int[N];

		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num, " ");
		for (int i = 0; i < N; i++) {
			tmp[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(tmp);
		
		System.out.println(tmp[0]);

	}

}
