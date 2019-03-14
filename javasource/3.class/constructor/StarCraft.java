public classs StarCraft{
	public static void main(String[] args){
		Marine my1 = new my();
		Marine com1 = new com();
		

		//내체력 : 100, 적체력 : 100
		System.out.println("내체력 : " + my.HP + ", 적체력 : " + com.HP);
		int count = 2;
		System.out.println("내가 적을" + count + " 회 공격!!!!");
		for(int i=0; i<count;i++){
			my.attack(com);
		System.out.println("내체력 : " + my.HP + ", 적체력 : " + com.HP);
		}
		
		//내체력 : 100, 적체력 : 80
		System.out.println(Marine2.info());
		count = 3;
		System.out.println("적이 나를" + count + " 회 공격!!!");
		
		//내체력 : 60, 적체력 : 80
		System.out.println(Marine3.info());
		System.out.println("모드 변경!!!");
		
		//내체력 : 35, 적체력 : 80
		System.out.println(Marine4.info());
		count = 3;
		System.out.println("내가 적을" + count + " 회 공격!!!");
		
		//내체력 : 35, 적체력 : 35
		System.out.println(Marine5.info());
		System.out.println("모드 변경!!!");
		
		//경고 : 모드 변경 불가~!!!!
		//내체력 : 35, 적체력 : 35
		System.out.println(Marine6.info());
		
		count = 3;
		System.out.println("내가 적을 " + count + " 회 공격!!!");
		my.attack(com.count);
		//내체력 : 35, 적체력 : die
		System.out.println("내체력 : " + my.getStatus + "적체력" + com.getStatus );
	}
}

call by value, reference