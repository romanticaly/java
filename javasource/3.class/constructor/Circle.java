/*
1. 반지름 : radius()
2. 넓이 : calcArea()
   둘레 : calcRound()
*/

public class Circle{
	
	double radius;
	
	public Circle(){
		this(4);
	}
	
	//public void DohyungTest(){}
	
	double calcArea2(){
		return Math.pow(radius, 2) * Math.PI;
	}
	
	double calcRound2(){
		Math m = new Math();
		return Math.PI * radius * 2;
	}
	
	public Circle(double radius){
		this.radius = radius;
	}

}