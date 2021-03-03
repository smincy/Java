package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_1097_바둑알뒤집기 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int map[][] = new int[20][20];

		StringTokenizer st;

		for (int i = 1; i <= 19; i++) {
			String temp = br.readLine();
			st = new StringTokenizer(temp, " ");
			
			for (int j = 1; j <= 19; j++) {	
				map[i][j] = Integer.parseInt(st.nextToken());
			}

		}
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String P = br.readLine();
			st = new StringTokenizer(P, " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			for (int j = 1; j <= 19; j++) {
				if (map[x][j] == 0) {
					map[x][j] = 1;
				} else
					map[x][j] = 0;
			}
			for (int j = 1; j <= 19; j++) {
				if (map[j][y] == 0) {
					map[j][y] = 1;
				} else
					map[j][y] = 0;
			}
			
		}
		
		for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 19; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}

}
