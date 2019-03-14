public class TaxiGuest{
	public static void main(String[] args){
		Taxi t1 = new Taxi();
		System.out.println("t1 >> " + t1.info() + " 기본요금 : " + t1.basicprice);

		Taxi t2 = new Taxi("k5","감홍색","기아");
		System.out.println("t2 >> " + t2.info() + " 기본요금 : " + t2.basicprice);
	
		int km =20;
		System.out.println(t2.info() + "를 타고 구디에서 강남까지 " + km + "km이동!!!");
		
		int price = t2.calcPrice(km);
		System.out.println("요금 : " + price + "원");

		km = 20;
		System.out.println(t2.info() + "를 타고 강남에서 구디까지 " + km +"km 이동!!!");
		System.out.println(t2.hour);
		price = t2.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		System.out.println("누적 수익 : " + t2.totalprice + "원");

	}
}