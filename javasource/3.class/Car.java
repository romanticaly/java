public class Car{
	
	String carName;
	String color;
	String maker;//초기값이 null, 숫자는 0이 초기값
	int speed;//전역변수

	public Car() {}

	public void speedUp(){
		speed += 10;//지역변수에는 접근제어자를 쓸수없다.
	}

	public void speedDown(){
		speed -= 10;
		if(speed<0)
			stop();//주소를 안밝혀도 된다.	
	}

	public void stop(){
		speed = 0;
	}

	//실제 사용되는 메소드는 아니다. main메소드가 없음



}