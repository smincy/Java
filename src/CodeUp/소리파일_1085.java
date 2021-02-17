package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소리파일_1085 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// h 소리강약 체크하는 수
		// b 체크한 결과를 저장하는 비트
		// c 좌우 등 소리를 저장할 트랙 개수
		// s 녹음 시간
		// 필요한 저장 용량을 계산해라
		// 예) 44.1KHz, 16bit, 스테레오, 1초 = 44100 * 16 * 2 * 1 bit

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp = br.readLine();

		StringTokenizer st;
		br.close();

		st = new StringTokenizer(temp, " ");

		double h = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double c = Integer.parseInt(st.nextToken());
		double s = Integer.parseInt(st.nextToken());

		double size = (h * b * c * s) / 8 / 1024 / 1024;
		//size = size / 8 / 1024 / 1024;

		System.out.format("%.1f" + " " + "MB", size);

	}

}
