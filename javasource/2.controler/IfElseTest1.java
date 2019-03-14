public class IfElseTest1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		if(x > y) {
			System.out.println(x + "는" + y + "보다크다.");
		} else {
			System.out.println(x + "는" + y + "보다작다.");
		}
		String ds;
		if(x > y) {
			ds = "크다."; 
		} else {			
			if (x==y) {
				ds = "같다";
			}	ds = "작다.";

			}
		}

		

		System.out.println(x + "는" + y + "보다" + ds);

	}
}