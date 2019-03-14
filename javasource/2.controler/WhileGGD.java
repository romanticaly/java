public class WhileGGD{
	public static void main(String[] args){
		System.out.println("***구구단***");
		int dan =2;
		while(dan<10){
			int i =0;//변수를 어디서 찍어야하는지
			while(i<10){
				System.out.print(dan + " * " + i + " = " + dan * i + "  ");
				i++;//쁠쁠을 어디다 찍어야 하는지
			}
			dan++;//단을 어디다 찍어야 하는지
			System.out.print("\n");
		}
	}

}