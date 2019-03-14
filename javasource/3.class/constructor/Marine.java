/*
1. 체력 hp 100, 모드 ( 0 : 일반, 1 : 흥분)
2. 공격 attack()
	1회 공격당 적체력 (0 : -10, 1 : -15)
   모드변경 changeMode()
    내체력 -25;
	내체력 40이하일 경우는 변경 불가
*/
public class Marine{
		
		/*int my;
		int com;
		String HP1;
		String HP2;
		
		
		public void my(String HP1) {
			this.HP1 = 100;
			attack();
			changeMode();
			if(HP1==0){
				HP1 = "die";
			}
		}
		
		public void com(String HP2) {
			this.HP2 = 100;
			attack();
			changeMode();
			if(HP2==0){
				HP2 = "die";
			}
		}
		
		public void attack(){
			attack -=10;
			return attack;
		}
		
		public void changeMode(){
			changeMode-=25;
			return changeMode;
		}		
		
		String info(){
			return("내체력 : " + HP1 + " 적체력 : " + HP2 );
		}
		
		*/

		int HP;
		int Mode;

		public Marine(){
			HP = 100;
		}

		/*public void attack(){
			if(Mode == 0){
				HP-=10;
				if(HP<=0){
					System.out.println("die");
				}
				
			} else {
				HP-=15;
				if(HP<=0){
					System.out.println("die");
				}
			}
		public void changeMode(){
			if(Mode = 0){
				Mode = 1-Mode;
				HP -= 25;
				if(HP < 40){
					Mode = Mode;
				}
			} 
				
			}*/
			void attack(Marine enemy, int count){
				for(int i=0; i<count;i++){
					enemy.HP -= power;
				}
			}
			

			void changeMode(){
				if(HP<40){
					if(Mode == 0){
						Mode = 1;
						HP -= 25;
					} else {
						Mode = 0;
					}

				} else {
					System.out.println("경고 :  모드 변경 불가~!!!!!");
				}
			}

			String getStatus(){
				return HP < 0 ? "die" : HP + " ";
			}
}

	
