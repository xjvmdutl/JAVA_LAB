package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		int dan = 2;
		int count = 1;
//		for(;dan <= 9; dan++) {//�ʱ�ȭ ������ ���Ű���
//			//�ۿ� �ִ� dan �� �ȿ� �ݺ��� ����ǰ� ����
//			for(count=1;count<=9;count++) {//�ϳ��� �� // for������ �ʱ�ȭ �߱� ������ ���� �ʱ�ȭ x
//				System.out.println(dan + "x" + count + " = "+ dan*count);
//			}
//			System.out.println();
//		}
		//while�� ����
		dan = 2;//dan �ʱ�ȭ
		count = 1;//count �ʱ�ȭ
		while(dan <= 9) {
			count = 1;//count�� �ʱ�ȭ�� ���߱� ������ ���� �ݺ����� ���d���� x
			while(count <= 9) {
				System.out.println(dan + "x" + count + " = "+ dan*count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}
