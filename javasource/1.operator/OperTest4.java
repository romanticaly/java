public class OperTest4{
	public static void main(String[] args){
		
		int jumin = 2;
		String gender = jumin % 2 == 0 ? "여자" : "남자";
		System.out.println("주민번호가" + jumin + "인 당신은" + gender + "입니다.");
		//삼항연산자는 실행문은 안되고 값만 가능하다.

		//점수가 80이상이면 합격, 80미만이면 불합격
		//당신의 점수는 xx이므로 xx입니다.
		int score = 80;
		String a = 100 - score >= 20 ? "합격" : "불합격"; //score >= 80 ? "합격" : "불합격"
		System.out.println("당신의 점수는 " + score + " 이므로" + a + "입니다.");
		

		
	}
}