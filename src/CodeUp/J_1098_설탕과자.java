package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_1098_¼³ÅÁ°úÀÚ {

	public static String wh, tp;
	public static int w, h, n;
	public static int[][] temp;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		wh = br.readLine();
		st = new StringTokenizer(wh, " ");
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		n = Integer.parseInt(br.readLine());

		temp = new int[n+1][4];

		for (int i = 1; i <= n; i++) {
			tp = br.readLine();
			st = new StringTokenizer(tp, " ");
			temp[i][0] = Integer.parseInt(st.nextToken());
			temp[i][1] = Integer.parseInt(st.nextToken());
			temp[i][2] = Integer.parseInt(st.nextToken());
			temp[i][3] = Integer.parseInt(st.nextToken());
		}

		MAP();

	}

	public static void MAP() {

		int map[][] = new int[w+1][h+1];

		for (int i = 1; i <= n; i++) {

			if (temp[i][1] == 0) {
				int a = temp[i][0];
				for (int j = 0; j < a; j++) {
					map[temp[i][2]][(temp[i][3]) + j] = 1;
				}
			} 
			else if (temp[i][1] == 1) {
				int a = temp[i][0];
				for (int j2 = 0; j2 < a; j2++) {
					map[(temp[i][2]) + j2][temp[i][3]] = 1;
				}
			}

		}

		for (int i = 1; i <= w; i++) {
			for (int j = 1; j <= h; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
