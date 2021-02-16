package CodeUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 색만들기_1084 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String color = br.readLine();
		StringTokenizer st;
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(color, " ");

		int r = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int temp = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < g; j++) {
				for (int k = 0; k < b; k++) {
					bw.write(i + " " + j + " " + k + "\n");		// bufferedWriter 가 시간이 단축
					temp++;
				}
			}
		}
		bw.write(String.valueOf(temp)); 
		bw.flush();
	}
	
}
