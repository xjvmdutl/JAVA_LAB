package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		int myNum = 10;
		int yourNum = 20;
		myNum = myNum + yourNum;//�̷��Ե� ����������
		myNum += yourNum;//�̷��� �� ���� ����
		System.out.println(myNum);
		
		int gameScore = 150;
		//int lastScore = ++gameScore;//�׿� ���ʿ� ������� ���� ��Ű�� ����
		//gameScore += 1,gameScore = gamaScore +1
		int lastScore = gameScore++;
		//�׿� ���ʿ� ������� ���� ��Ű�� ���� 
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
