public class Book4_1{
	public static void main(String[] args){
		int dice1 = (int)(Math.random()*5+1);
		int dice2 = (int)(Math.random()*5+1);
		
		
		while(dice1+dice2=5){
			System.out.println(dice1, dice2);
		}
	}
}