package ch08;

public class CharaterTest {

	public static void main(String[] args) {
		char ch1 = 'A'; //2byte�� ����Ѵ�.
		System.out.println(ch1);
		System.out.println((int)ch1);//typeCast �ڷ��� ������ȯ
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);//charŸ���̶� �ɽ�Ʈ �ʿ� ����.
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);//67�� �ش�Ǵ� �ƽ�Ű������ ��ȯ�Ǽ� C�� ���
		
		//char ch = -66;//��� �Ұ���,������ �� �� ����.
		//char ch = -1234567;//��� �Ұ���,2byte�̻� �ڵ鸵 �Ҽ� ��� �ȵȴ�.
		char han = '��';
		char ch = '\uD55C';// (\\u+�ڵ尪(�����ڵ�ǥ�� ����))
							//16��Ʈ
		System.out.println(ch);
		System.out.println(han);
	}

}
