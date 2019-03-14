public class Car {

	String carName;
	String color;
	String maker;
	int speed;

	public void CarUser(){}

	public Car() {
		/*carName = "쏘나타";
		color = "검정색";
		maker = "현대";
		*/
		this("쏘나타","검정색","현대");
	}

	public Car(String color){
		/*carName = "쏘나타";
		this.color = color;
		maker = "현대";
		*/
		this("쏘나타", color, "현대");
	}

	public Car(String carName, String color){
		/*this.carName = carName;
		this.color = color;
		maker = "현대";
		*/
		this(carName, color, "현대"); //this()는 생성자 첫번째 줄에서만 호출이 가능하다.
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
		return "1.차이름 : " + carName + " 색상 : " + color + " 제조사 : " + maker;
	}

}

