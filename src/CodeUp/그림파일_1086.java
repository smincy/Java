package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 그림파일_1086 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp = br.readLine();

		StringTokenizer st = new StringTokenizer(temp, " ");

		double w = Integer.parseInt(st.nextToken()); // 가로
		double h = Integer.parseInt(st.nextToken()); // 세로
		double b = Integer.parseInt(st.nextToken()); // 비트

		double size = (w * h * b) / 8 / 1024 / 1024;

		System.out.format("%.2f" + " " + "MB", size);

	}

}
