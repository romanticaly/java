/*
1. ���� : width ���� : height
2. ���� : calcArea()
   �ѷ� : calcRound()

*/
public class Rect{
		
		int width;
		int height;
		
		//public void DohyungTest(){}
		
		public Rect() {
			this(4, 6);
		}
		
		public Rect (int width, int height) {
			this.width = width;
			this.height = height;
		}
		
		int calcArea1(){
			return width * height;
		}
			
		
		int calcRound1(){
			return 2 * (width + height);
		}
		
		
		
	}
