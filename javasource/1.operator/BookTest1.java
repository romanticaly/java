public class BookTest1{
	public static void main(String[] agrs){
		
		//int x = 10;
		//int y = 20;
		//int z = (++x) + (y--);
		//System.out.println(z);
		
		int score = 85;
		String result = (!(score>90)) ? "��" : "��";
		System.out.println(result);
		
		int pencils = 534;
		int students = 30;
		
		//�л� �� ���� ������ ���� ��
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		//���� ���� ��
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);

		int value =356;
		System.out.println(value - value%100);
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = lengthTop * height + (lengthBottom-lengthTop) * height * 1/2;
		System.out.println(area);

		int x = 10;
		int y = 5;

		System.out.println((x>7) && (y<=5));
		System.out.println((x%3 == 2) || (y%2 != 1));
		

	}
}
