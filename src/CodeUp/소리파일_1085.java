package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �Ҹ�����_1085 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// h �Ҹ����� üũ�ϴ� ��
		// b üũ�� ����� �����ϴ� ��Ʈ
		// c �¿� �� �Ҹ��� ������ Ʈ�� ����
		// s ���� �ð�
		// �ʿ��� ���� �뷮�� ����ض�
		// ��) 44.1KHz, 16bit, ���׷���, 1�� = 44100 * 16 * 2 * 1 bit

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
