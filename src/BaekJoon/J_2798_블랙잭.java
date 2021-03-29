package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_2798_∫Ì∑¢¿Ë {

	public static int N, M;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		int J[] = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < J.length; i++) {
			J[i] = Integer.parseInt(st.nextToken());
		}

		int out = 0;

		loop: for (int i = 0; i < N - 2; i++) {
			for (int j = i+1; j < N - 1; j++) {
				for (int k = j+2; k < N; k++) {
					int temp = J[i] + J[j] + J[k];
					if (M == temp) {
						out = temp;
						break loop;
					} else if (M >= temp) {
						out = Math.max(out, temp);
					}

				}
			}
		}
		System.out.println(out);
	}

}
