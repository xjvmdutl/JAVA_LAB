package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {
//		int age = 17;
//		int charge;//������ �����ϰ� �ʱ�ȭ�� ���߱� ������ ������ ���� 
//		//int charge = 3000; //�̷��� �ʱ�ȭ �ϸ� ���� ����.
//		if(age < 9) {
//			charge = 1000;
//			System.out.println("�� ���� �Ƶ��Դϴ�.");
//		}else if(age < 14) {
//			charge = 2000;
//			System.out.println("�ʵ��л��Դϴ�.");
//		}else if(age < 20) {
//			charge = 2500;
//			System.out.println("��,����л��Դϴ�.");
//		}else {//else���� ��� charge�� �ʱ�ȭ ���� ���ǿ� ���� ������� ���� ������ ���ϱ� ������ ����
//			//����Ʈ ���� ������ �־�ߵȴ�.
//			charge = 3000;
//			System.out.println("�Ϲ����Դϴ�.");
//		}
		
		int age = 12;
		int charge; 
		if(age < 9) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}
		if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("��,����л��Դϴ�.");
		}else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		//�������� ������ ���ÿ� ����ȴ�.
		//�ϳ��� ��Ȳ�� ���ؼ� ������ ������ �б��Ҷ��� �ݵ�� if else�� ��ߵȴ�.
		//������ ������ ���ε��� �Ǻ��Ҷ��� if  if�� ����.
		
		System.out.println("������ "+ charge + "�Դϴ�.");
	}
}
