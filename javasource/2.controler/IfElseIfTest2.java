/*
score��
	90�̻��̸� ������ A
	80�̻��̸� ������ B
	70�̻��̸� ������ C
	60�̻��̸� ������ D
	60�̻��̸� ������ F

X5�̻��̸� X+����

��� : ������ xx���̹Ƿ� x�����Դϴ�.
*/

public class IfElseIfTest2 {
	public static void main(String[] args){
		int score =90;
		String credit;
		if(score >= 90){
				credit ="A";	
				if(score >= 95){
					credit ="A+";
				}
		} else if (score >= 80){
				credit ="B";
				if(score >= 85){
					credit ="B+";
				}
		} else if (score >= 70){
				credit ="C";	
				if(score >= 75){
					credit ="C+";
				}
		} else if (score >= 60){
				credit ="D";
				if(score >= 65){
					credit ="D+";
				}
		} else {
				credit ="F";
		}
		System.out.println("������" + score + "�� �̹Ƿ�" + credit + "�����Դϴ�.");

		if(score == 100){
				credit ="A+";
		} else if(score >= 90){
				credit ="A";
		} else if(score >= 80){
				credit ="B";
		} else if(score >= 70){
				credit ="C";
		} else if(score >= 60){
				credit ="D";
		} else {
				credit ="F";
		}
		if(score<60 && score%10 >= 5){
			credit = "+";
		}
		
		System.out.println("������" + score + "�� �̹Ƿ�" + credit + "�����Դϴ�.");

	}
}