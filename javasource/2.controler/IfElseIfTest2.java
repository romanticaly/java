/*
score가
	90이상이면 학점은 A
	80이상이면 학점은 B
	70이상이면 학점은 C
	60이상이면 학점은 D
	60이상이면 학점은 F

X5이상이면 X+학점

결과 : 점수가 xx점이므로 x학점입니다.
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
		System.out.println("점수가" + score + "점 이므로" + credit + "학점입니다.");

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
		
		System.out.println("점수가" + score + "점 이므로" + credit + "학점입니다.");

	}
}
