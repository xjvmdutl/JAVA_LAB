package ch21;

public class BreakTest {
	
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		//for(num =1; sum <= 100;num++) {
		for(num =1; ;num++) {
			sum += num;//sum�� 100�̵ɋ����� ���Ѵ�.
			if(sum >= 100) //�׳� for���� ������ ������ num�� �ϳ� ������ ���� ������ ������
						    //if���� break�� �ɾ �����Ǳ� ���� for�� ����
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
