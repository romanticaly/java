/*
*가위 바위 보 게임
*1. 0(가위), 1(바위), 2(보)
*2. 컴 :  난수 (0,1,2)
*3. 결과 Logic (이기거나 지거나 비기거나)
*4. 결과출력
    나  : 보  컴  : 바위   결과 : 이겼다.
    나  : 보  컴  : 보   결과 : 비겼다.
    나  : 보  컴  : 가위   결과 : 졌다.
*/

public class GBB{
	public static void main(String[] args){
		int my = (int) (Math.random() * 3);
		int com = (int) (Math.random() * 3);
		
		String resultStr;
		String myStr;
		String comStr;

		
		int result = (my - com + 2) % 3;
		if(result ==0) {
			resultStr = "이겼다.";
		} else if(result ==1) {
			resultStr = "졌다.";
		} else {
			resultStr = "비겼다.";
		}
	
		switch(my) {
			case 0 : myStr = "가위";break;
			case 1 : myStr = "바위";break;
			default : myStr = "보";break;
		}

		switch(com) {
			case 0 : comStr = "가위";break;
			case 1 : comStr = "바위";break;
			default : comStr = "보";break;
		}

		System.out.println("나 : " + myStr + ", 컴 : " + comStr + " 결과 : " + resultStr);




		if (my ==0){
			switch (com % 3){
			case 0 : System.out.println("나 : 보, 컴 : 바위 결과 : 이겼다.");break;
		    case 1 : System.out.println("나 : 보, 컴 : 가위 결과 : 졌다.");break;
			default : System.out.println("나 : 보, 컴 : 보 결과 : 비겼다.");
			}
		} else if (my ==1){
			switch (com % 3){
			case 0 : System.out.println("나 : 가위, 컴 : 바위 결과 : 졌다.");break;
		    case 1 : System.out.println("나 : 가위, 컴 : 가위 결과 : 비겼다.");break;
			default : System.out.println("나 : 가위, 컴 : 보 결과 : 이겼다.");
			}
		} else {
			switch (com % 3){
			case 0 : System.out.println("나 : 바위, 컴 : 바위 결과 : 비겼다.");break;
		    case 1 : System.out.println("나 : 바위, 컴 : 가위 결과 : 이겼다.");break;
			default : System.out.println("나 : 바위, 컴 : 보 결과 : 졌다.");
			}
		}
	
	}
}




//java SE기본형
//     EE서버사이드 프로그램
//     ME소형가전제품제어