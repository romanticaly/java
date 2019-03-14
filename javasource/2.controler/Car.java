public class Car{
	
	String carName;
	String color;
	String maker;
	int speed;//전역변수

	public void speedUp(){
		speed +=10;
	}

	public void speedDown(){
		speed -=10;
	}

	public void stop(){
		speed =0;
	}

}