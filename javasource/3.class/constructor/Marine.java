/*
1. ü�� hp 100, ��� ( 0 : �Ϲ�, 1 : ���)
2. ���� attack()
	1ȸ ���ݴ� ��ü�� (0 : -10, 1 : -15)
   ��庯�� changeMode()
    ��ü�� -25;
	��ü�� 40������ ���� ���� �Ұ�
*/
public class Marine{
		/*
		int my;
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
			return("��ü�� : " + HP1 + " ��ü�� : " + HP2 );
		}
		
		*/

		int HP;
		int Mode;
		int power;

		public Marine(){
			HP = 100;
			power =15;
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
				for(int i=0; i<count; i++){
					enemy.HP -= power;
				}
			}
			

			void changeMode(){
				if(HP>40){
					if(Mode == 0){
						Mode = 1;
						HP -= 25;
						power = 15;
					} else {
						Mode = 0;
						power = 10;
					}

				} else {
					System.out.println("��� :  ��� ���� �Ұ�~!!!!!");
				}
			}

			String getStatus(){
				return HP < 0 ? "die" : HP + " ";
			}
}