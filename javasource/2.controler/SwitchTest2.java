/*
score가
	90이상이면 학점은 A
	80이상이면 학점은 B
	70이상이면 학점은 C
	60이상이면 학점은 D
	60미만이면 학점은 F

X5이상이면 X+학점

결과 : 점수가 xx점이므로 x학점입니다.
*/

public class SwitchTest2 {
	public static void main(String[] args){
		int score = 96;
		String grade;
		switch (score / 10){
			case 10 : case 9 : grade = 'A';break;
			case 8 : grade = "B";break;
			case 7 : grade = "C";break;
			case 6 : grade = "D";break;
			default : grade = "F";break;
		}
		if(score<60 && score%10 >= 5){
			grade = "+";
		}

		System.out.println("점수가" + score + "점 이므로" + credit + "학점입니다.");
	}
}