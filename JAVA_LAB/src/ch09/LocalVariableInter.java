package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "test";
		//�����Ϸ��� ������ ���������� �ڷ����� �߷� 
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;//String���� �߷��߱� ������ �����ϴ°� ���� String���� �߷�
		System.out.println(str2);
		
		str = "hello";
		//str = 3;//��ũ��Ʈ���� ���������� �ڹٿ��� �Ұ���(�ڷ����� �̹� ���ؠ��� ������)
		
	}

}
