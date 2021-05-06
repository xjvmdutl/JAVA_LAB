package ch16;

import java.util.Scanner;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = switch(month) {//java 14 ���� ���� �߰��� switch-case��
			//���� ��ȯ ������ �ִ�.
			case 1,3,5,7,8,10,12 ->{
				System.out.println("�̹� ���� 31�ϱ��� �Դϴ�");
				yield 31;				// day = 31;
				//�߰�ȣ�� �������(������ 2�ܶ� �̻��� ��� yield�� ���ϵǴ°��� ����Ѵ�.
			}
			case 2 ->//������ �Ѵܶ��ϰ�� �߰�ȣx, return �������´�
				28;				// day = 28;
			case 4,6,9,11 ->
				30; 				// day=30;

			default -> {//������ �ΰ��� ��� �߰�ȣ�� ����
				System.out.println("�������� �ʴ� ���Դϴ�.");
				yield -1;				//day = -1; 
			}
		};
		System.out.println(month + "���� "+ day + "�� �Դϴ�.");
	}

}
