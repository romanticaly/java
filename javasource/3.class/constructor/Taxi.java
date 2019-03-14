/*
1.요금
기본요금
 일반 : 3000
 심야 : 5000
요금합
손님 태우고 받을 요금
 일반 : 100/km
 심야 : 150/km

2.요금 계산(calcPrice())
3.심야할증 : 0시~6시
*/
import java.util.*;

public class Taxi extends Car {

	int basicprice;
	int totalprice;
	int price;
	int hour;

	public Taxi() {
		super();
		basicprice =3000;
	}

	public Taxi(String carName, String color, String maker) {
		super(carName, color, maker);
		basicprice = 3000;
	}


	int calcPrice(int km){
		Calendar calendar = Calendar.getInstance();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);

		price = basicprice + (km * 100);
		totalprice = price;
		return price;
	}

}