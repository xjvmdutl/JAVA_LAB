package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		//while -> do while
		Scanner sc = new Scanner(System.in);
		int input;//�Է¹޴¾�
		int sum = 0;
		/* do while ��ȯ
		input = sc.nextInt();
		while(input != 0) {
			sum += input;
			input =sc.nextInt();
		}
		*/
		do {
			input =sc.nextInt();
			sum += input;
		}while(input!=0);//�Է¹޾ƾ� �Ǵ� �ڵ尡 �ݺ������� �ְ� �ݺ��� �ۿ��� �����Ƿ� �ϳ��� ��ģ��
		System.out.println(sum);
	}
}
