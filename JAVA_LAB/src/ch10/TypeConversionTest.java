package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		/*
		byte bNum =10;
		int iNum = bNum;//�ƹ� ���� ����.//1->4
		
		int iNum1 =20;
		float fNum = iNum1;//�ƹ� ���� ����.//4->4
		
		iNum=10;
		iNum = (byte)iNum;//���������ȯ �ʿ� // 4->1
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;//���������ȯ �ʿ� // 4->8
		*/
		/*
		int iNum = 255;//����Ʈ ǥ������ �Ѿ��.//byte�� ���� �ִ� ������ ���� x
		byte bNum = (byte)iNum;
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		System.out.println(inum);//�Ҽ��� �����, �ٿ� �ɽ���
		*/
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;//1+0 = 1
		int iNum2 = (int)(dNum + fNum);//double+float = double
		//1.2+0.9 =2.1-> 2
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
