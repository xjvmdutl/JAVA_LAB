package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		for(num = 1 ;num<=100 ; num++) {
			if((num % 3) != 0) //3�� ����� �ƴϴ� //������ �켱���� ������ %�� ���� ��������� ������ ������
				continue;
			System.out.println(num);//�ش� ���� ��� ���Ѵ�.
		}
	}

}
