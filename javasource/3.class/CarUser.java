public class CarUser{
	public static void main(String[] args){
		Car car1 =null;
		car1 = new Car();
		System.out.println("1. ���̸� : " + car1.carName + " ���� : " +car1.color + " ������ : " +car1.maker);
		
		car1.carName = "�Ÿ";
		car1.color = "������";
		car1.maker = "����" ;
		System.out.println("2. ���̸� : " + car1.carName + " ���� : " +car1.color + " ������ : " +car1.maker);
		
		System.out.println("���� " + car1.carName + "�� �ӵ� : " + car1.speed);
		System.out.println("car1�� �ӵ��� 2ȸ ����!!!");
		car1.speedUp();
		car1.speedUp();
		System.out.println("2ȸ ���� �� " + car1.carName + "�� �ӵ� : " + car1.speed);
		System.out.println("car1�� �ӵ��� 8ȸ ����!!!");
		for(int i=0; i<8;i++){
			car1.speedUp();
		}
		System.out.println("8ȸ ���� �� " + car1.carName + "�� �ӵ� : " + car1.speed);
		System.out.println("car1�� �ӵ��� 4ȸ ����!!!");
		for(int i=0; i<4;i++){
			car1.speedDown();
		}
		System.out.println("4ȸ ���� �� " + car1.carName + "�� �ӵ� : " + car1.speed);
		

		
		Car car2 = new Car();
		System.out.println("Z. ���̸� : " + car2.carName + " ���� : " +car2.color + " ������ : " +car2.maker);
		car2.carName = "k5";
		car2.color = "���";
		car2.maker = "���" ;
		System.out.println("ZZ. ���̸� : " + car2.carName + " ���� : " +car2.color + " ������ : " +car2.maker);
		
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
	}
}