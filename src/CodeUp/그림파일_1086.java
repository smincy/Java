package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �׸�����_1086 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp = br.readLine();

		StringTokenizer st = new StringTokenizer(temp, " ");

		double w = Integer.parseInt(st.nextToken()); // ����
		double h = Integer.parseInt(st.nextToken()); // ����
		double b = Integer.parseInt(st.nextToken()); // ��Ʈ

		double size = (w * h * b) / 8 / 1024 / 1024;

		System.out.format("%.2f" + " " + "MB", size);

	}

}
