package ch13;

import java.util.Scanner;//�� ���̺귯���� �ִٴ� ���� �˷��� 

public class ConitionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//�Է¹޴� Ŭ����, java.util�� ����ִ�
		//system.in = ǥ�� �Է� system.out = ǥ�� ���
		int max;
		System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����ϼ���\n");
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt();//������ �Է¹޴´�, �Է��� ��ٸ���.
		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt();
		
		max = (num1 > num2) ? num1 : num2;//num1�� num2���� ũ�� max =num1 �ƴϸ� max=num2
		System.out.println(max);
	}

}
