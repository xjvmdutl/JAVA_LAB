package ch17;

public class WhileTest {

	public static void main(String[] args) {//�߰�ȣ �� ���� = �������� (�ڵ����� �ʱ�ȭx)
		//1~10���� ���ϱ� ���� (�ϳ��� ������ �ݺ��ǰ� ���)
		int num = 1;
		int sum = 0;//���ϴ� ��� // ���������� �ʱ�ȭ
		while(num <=10) {
			sum += num;//sum �������� ���� -�ʱ�ȭ�� �ȵǼ� ���� 
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
