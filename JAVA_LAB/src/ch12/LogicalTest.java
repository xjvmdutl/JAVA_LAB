package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		boolean flag =(num1 > 0) && (num2 > 0);//�Ѵ� ��
		System.out.println(flag);//true
		
		flag = (num1 < 0 ) && (num2 > 0);//�ϳ� ���� 
		System.out.println(flag);//false
		
		flag = (num1 > 0 ) || (num2 > 0);//�Ѵ� ��
		System.out.println(flag);//true
		
		flag = (num1 < 0 ) || (num2 > 0);//�ϳ� ����
		System.out.println(flag);//true
		
		flag = !(num1 > 0 );
		System.out.println(flag);//false
	}

}
