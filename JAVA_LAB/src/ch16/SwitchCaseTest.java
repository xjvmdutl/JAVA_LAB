package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ctrl + shift + o = import ����Ű
		int month = sc.nextInt();//�� �Է¹ޱ�
		int day;
		switch(month) {//�� ��� �Է�(�б� ����)
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: //���� ������ ������� �ϳ��� ��ģ��
				day = 31;
				break; // ���� ���� ��� �ڵ尡 ������ �귯����.
			case 2 : 
				day = 28;
				break;
			case 4: 
				day=30;
				break;
			case 6: 
				day=30;
				break;
			case 9: 
				day=30;
				break;
			case 11: 
				day=30;
				break;
			default : //��� ���ص� �ȴ�.
				System.out.println("�������� �ʴ� ���Դϴ�.");
				day = -1;
		}
		System.out.println(month + "���� "+ day + "�� �Դϴ�.");
	}

}
