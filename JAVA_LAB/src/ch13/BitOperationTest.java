package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		int num1 = 5; //00000101
		int num2 = 10;//00001010
		System.out.println(num1 | num2);//00001111 // 15
		System.out.println(num1 & num2);//00000000 // 0
		System.out.println(num1 ^ num2);//00001111 // 15
		System.out.println(~num1); //11111010 //������ ���´�(���� ������ ���Ȱ�)
		
		System.out.println(num1 << 2);//00010100 //���� ��Ʈ�� ������� 
									  //20 = 5*2^2 �� ���� , �ݴ��ϰ�� 2^n���� ������
		System.out.println(num1);//num1�� ��ü�� ������� �ʴ´�
		System.out.println(num1 <<= 2);//���մ��� �����ڸ� ���� num1 ��ü ���氡��
		System.out.println(num1);
		System.out.println(num1 >> 1);//00001010 //10 = 20/2
	}

}
