public class OperTest1
{
	
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(--x);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(x++);
		System.out.println(x);
	
		char c = 'a';
		System.out.println("c == " + c);
		System.out.println("(int)c == " + (int)c); //강제형변환

		int y = c;
		System.out.println("y == " + y); // 저장공간이 넉넉해서 자동형변환
	
		c = (char)y;
		System.out.println("c == " + c); // 강제형변환 없이는 저장공간이 없어서 에러남

		//문자마다 ascii코드 값이 있어서 형변환이 가능하지만 booleand은 불가능하다.
		
		//boolean b = true;
		//int z = b; // error

		int z = 30;
		double d = z;
		//z = d; error
		z =(int)d;



	}
}
