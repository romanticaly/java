public class StarCraft{
	public static void main(String[] args){
		Marine my = new Marine();
		Marine com = new Marine();
		

		//��ü�� : 100, ��ü�� : 100
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		int count = 2;
		System.out.println("���� ����" + count + " ȸ ����!!!!");
		my.attack(com, count);
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		
		
		//��ü�� : 100, ��ü�� : 80
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		count = 3;
		System.out.println("���� ����" + count + " ȸ ����!!!");
		for(int i=0; i<count; i++){
			com.attack(my, count);
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		}

		//��ü�� : 60, ��ü�� : 80
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		my.changeMode();
		System.out.println("��� ����!!!");
		
		
		//��ü�� : 35, ��ü�� : 80
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		count = 3;
		System.out.println("���� ����" + count + " ȸ ����!!!");
		for(int i=0; i<count; i++){
			my.attack(com,count);
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		}
		
		//��ü�� : 35, ��ü�� : 35
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		my.changeMode();	
		System.out.println("��� ����!!!");
		
		//��� : ��� ���� �Ұ�~!!!!

		//��ü�� : 35, ��ü�� : 35
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		count = 3;
		System.out.println("���� ���� " + count + " ȸ ����!!!");
		for(int i=0; i<count; i++){
			my.attack(com,count);
		System.out.println("��ü�� : " + my.getStatus() + ", ��ü�� : " + com.getStatus());
		}
		//��ü�� : 35, ��ü�� : die
		System.out.println("��ü�� : " + my.getStatus() + "��ü��" + com.getStatus());
	}
}

call by value, reference