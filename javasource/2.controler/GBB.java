/*
*���� ���� �� ����
*1. 0(����), 1(����), 2(��)
*2. �� :  ���� (0,1,2)
*3. ��� Logic (�̱�ų� ���ų� ���ų�)
*4. ������
    ��  : ��  ��  : ����   ��� : �̰��.
    ��  : ��  ��  : ��   ��� : ����.
    ��  : ��  ��  : ����   ��� : ����.
*/

public class GBB{
	public static void main(String[] args){
		int my = (int) (Math.random() * 3);
		int com = (int) (Math.random() * 3);
		
		String resultStr;
		String myStr;
		String comStr;

		
		int result = (my - com + 2) % 3;
		if(result ==0) {
			resultStr = "�̰��.";
		} else if(result ==1) {
			resultStr = "����.";
		} else {
			resultStr = "����.";
		}
	
		switch(my) {
			case 0 : myStr = "����";break;
			case 1 : myStr = "����";break;
			default : myStr = "��";break;
		}

		switch(com) {
			case 0 : comStr = "����";break;
			case 1 : comStr = "����";break;
			default : comStr = "��";break;
		}

		System.out.println("�� : " + myStr + ", �� : " + comStr + " ��� : " + resultStr);




		if (my ==0){
			switch (com % 3){
			case 0 : System.out.println("�� : ��, �� : ���� ��� : �̰��.");break;
		    case 1 : System.out.println("�� : ��, �� : ���� ��� : ����.");break;
			default : System.out.println("�� : ��, �� : �� ��� : ����.");
			}
		} else if (my ==1){
			switch (com % 3){
			case 0 : System.out.println("�� : ����, �� : ���� ��� : ����.");break;
		    case 1 : System.out.println("�� : ����, �� : ���� ��� : ����.");break;
			default : System.out.println("�� : ����, �� : �� ��� : �̰��.");
			}
		} else {
			switch (com % 3){
			case 0 : System.out.println("�� : ����, �� : ���� ��� : ����.");break;
		    case 1 : System.out.println("�� : ����, �� : ���� ��� : �̰��.");break;
			default : System.out.println("�� : ����, �� : �� ��� : ����.");
			}
		}
	
	}
}




//java SE�⺻��
//     EE�������̵� ���α׷�
//     ME����������ǰ����