public class TaxiGuest{
	public static void main(String[] args){
		Taxi t1 = new Taxi();
		System.out.println("t1 >> " + t1.info() + " �⺻��� : " + t1.basicprice);

		Taxi t2 = new Taxi("k5","��ȫ��","���");
		System.out.println("t2 >> " + t2.info() + " �⺻��� : " + t2.basicprice);
	
		int km =20;
		System.out.println(t2.info() + "�� Ÿ�� ���𿡼� �������� " + km + "km�̵�!!!");
		
		int price = t2.calcPrice(km);
		System.out.println("��� : " + price + "��");

		km = 20;
		System.out.println(t2.info() + "�� Ÿ�� �������� ������� " + km +"km �̵�!!!");
		System.out.println(t2.hour);
		price = t2.calcPrice(km);
		System.out.println("��� : " + price + "��");
		System.out.println("���� ���� : " + t2.totalprice + "��");

	}
}