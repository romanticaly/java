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
		System.out.println("(int)c == " + (int)c); //��������ȯ

		int y = c;
		System.out.println("y == " + y); // ��������� �˳��ؼ� �ڵ�����ȯ
	
		c = (char)y;
		System.out.println("c == " + c); // ��������ȯ ���̴� ��������� ��� ������

		//���ڸ��� ascii�ڵ� ���� �־ ����ȯ�� ���������� booleand�� �Ұ����ϴ�.
		
		//boolean b = true;
		//int z = b; // error

		int z = 30;
		double d = z;
		//z = d; error
		z =(int)d;



	}
}
