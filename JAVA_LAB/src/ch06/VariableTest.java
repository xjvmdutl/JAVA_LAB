package ch06;

public class VariableTest {

	public static void main(String[] args) {
		byte bnum = -127;//-128~127����
		System.out.println(bnum);
		
		//int num = 12345678900;//���� �ʰ��� ���ͷ��� num�� ���� ũ��.
		//long lNum = 12345678900;//�̰� ���� ���� ���ͷ��� �ʹ� ũ��.
		long lNum = 12345678900L;
		//������쿡�� �ڵ����� int������ ����ȯ�� �ȴ�
		System.out.println(lNum);
		//������ ��� = �ǿ����� 
		//���׿����� = �ǿ����� 1�� , 2�׿����� = �ǿ����� 2�� , 3�׿����� = �ǿ����� 3��(3�׿�����)
	}

}
