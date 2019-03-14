/*
1.���
�⺻���
 �Ϲ� : 3000
 �ɾ� : 5000
�����
�մ� �¿�� ���� ���
 �Ϲ� : 100/km
 �ɾ� : 150/km

2.��� ���(calcPrice())
3.�ɾ����� : 0��~6��
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