public class Car {

	String carName;
	String color;
	String maker;
	int speed;

	public void CarUser(){}

	public Car() {
		/*carName = "�Ÿ";
		color = "������";
		maker = "����";
		*/
		this("�Ÿ","������","����");
	}

	public Car(String color){
		/*carName = "�Ÿ";
		this.color = color;
		maker = "����";
		*/
		this("�Ÿ", color, "����");
	}

	public Car(String carName, String color){
		/*this.carName = carName;
		this.color = color;
		maker = "����";
		*/
		this(carName, color, "����"); //this()�� ������ ù��° �ٿ����� ȣ���� �����ϴ�.
	}
	
	public Car(String carName, String color, String maker){
		this.carName = carName;
		this.color = color;
		this.maker = maker;
		
	}
	
	void speedUp(){
		speed +=10;	
	}

	int speedUp(int speed) {
		this.speed += speed;
		return this.speed;
	}
				
	void speedDown(){
		speed -=10;
		if(speed < 0)
			stop();
	}

	int speedDown(int speed) {
		this.speed -= speed;
		if(this.speed < 0)
			stop();
		return this.speed;
	}

	void stop(){
		speed = 0;
	}

	String info(){
		return "1.���̸� : " + carName + " ���� : " + color + " ������ : " + maker;
	}

}

