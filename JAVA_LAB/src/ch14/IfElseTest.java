package ch14;

public class IfElseTest {

	public static void main(String[] args) {
		int age = 6;
		if(age >= 8) {//8�� �̻��� ��츸 ��� �ƴҰ��� else
			System.out.println("�б��� �ٴմϴ�.");
			//�ܶ��� �ϳ��� ��� �߰�ȣ�� ���� �ʾƵ� �ȴ�.
			//������ �������� �������� ������ �߰�ȣ�� ���°��� ����
		}else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");//if �� �ش���� �ʴ°Ÿ� ����� �� �ִ�
		}
		//�鿩���⸦ �ݵ�� ���־�� �Ѵ�.(������)
		System.out.println("��°� �� ����");
	}

}
