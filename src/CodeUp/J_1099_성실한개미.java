package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_1099_성실한개미 {

	public static int[][] Map = new int[10][10];
	public static int x = 1, y = 1;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 0; i < 10; i++) {
			String tmp = br.readLine();
			st = new StringTokenizer(tmp, " ");
			for (int j = 0; j < 10; j++) {
				Map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Eat();

	}

	public static void Eat() {

		while (Map[x][y] != 2) {
			Map[x][y] = 9;
			if (Map[x][y + 1] != 1) {
				y += 1;
			} else if (Map[x + 1][y] != 1) {
				x += 1;
			} else {
				break;
			}
		}
		
		Map[x][y] = 9;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(Map[i][j] + " ");
			}
			System.out.println();
		}

	}
}
