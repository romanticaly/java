public class WhileGGD{
	public static void main(String[] args){
		System.out.println("***������***");
		int dan =2;
		while(dan<10){
			int i =0;//������ ��� �����ϴ���
			while(i<10){
				System.out.print(dan + " * " + i + " = " + dan * i + "  ");
				i++;//�ܻ��� ���� ���� �ϴ���
			}
			dan++;//���� ���� ���� �ϴ���
			System.out.print("\n");
		}
	}

}