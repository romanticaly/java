public class Car{
	
	String carName;
	String color;
	String maker;//�ʱⰪ�� null, ���ڴ� 0�� �ʱⰪ
	int speed;//��������

	public Car() {}

	public void speedUp(){
		speed += 10;//������������ ���������ڸ� ��������.
	}

	public void speedDown(){
		speed -= 10;
		if(speed<0)
			stop();//�ּҸ� �ȹ����� �ȴ�.	
	}

	public void stop(){
		speed = 0;
	}

	//���� ���Ǵ� �޼ҵ�� �ƴϴ�. main�޼ҵ尡 ����



}