public classs StarCraft{
	public static void main(String[] args){
		Marine my1 = new my();
		Marine com1 = new com();
		

		//��ü�� : 100, ��ü�� : 100
		System.out.println("��ü�� : " + my.HP + ", ��ü�� : " + com.HP);
		int count = 2;
		System.out.println("���� ����" + count + " ȸ ����!!!!");
		for(int i=0; i<count;i++){
			my.attack(com);
		System.out.println("��ü�� : " + my.HP + ", ��ü�� : " + com.HP);
		}
		
		//��ü�� : 100, ��ü�� : 80
		System.out.println(Marine2.info());
		count = 3;
		System.out.println("���� ����" + count + " ȸ ����!!!");
		
		//��ü�� : 60, ��ü�� : 80
		System.out.println(Marine3.info());
		System.out.println("��� ����!!!");
		
		//��ü�� : 35, ��ü�� : 80
		System.out.println(Marine4.info());
		count = 3;
		System.out.println("���� ����" + count + " ȸ ����!!!");
		
		//��ü�� : 35, ��ü�� : 35
		System.out.println(Marine5.info());
		System.out.println("��� ����!!!");
		
		//��� : ��� ���� �Ұ�~!!!!
		//��ü�� : 35, ��ü�� : 35
		System.out.println(Marine6.info());
		
		count = 3;
		System.out.println("���� ���� " + count + " ȸ ����!!!");
		my.attack(com.count);
		//��ü�� : 35, ��ü�� : die
		System.out.println("��ü�� : " + my.getStatus + "��ü��" + com.getStatus );
	}
}

call by value, reference