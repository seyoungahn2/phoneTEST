package Day16;

public class FightMain {
    public static void main(String[] args) throws InterruptedException {
        //기사, 악마
        Knight knight = new Knight("기사",50,2000);
        Villain villain = new Villain("악마",80,1200);
        Battle battle = new Battle();

        int count = 0;

        while(knight.getHp() > 0 && villain.getHp() > 0){
            System.out.println((count++) +"번째 경기가 시작됩니다.");
            //1.기사
            System.out.println("=============================================");
            battle.randomBurf(knight);
            battle.fight(knight,villain);
            System.out.println("=============================================");
            Thread.sleep(1000);
            if(knight.getHp() <= 0 || villain.getHp() <= 0) {
                break;
            }
            //2.악마
            System.out.println((count++) +"번째 경기가 시작됩니다.");
            System.out.println("=============================================");
            battle.randomBurf(villain);
            battle.fight(villain,knight);
            System.out.println("=============================================");
        }

        if(knight.getHp() > villain.getHp()){
            System.out.println("기사 승");
        }
        else{
            System.out.println("악마 승");
        }
    }
}
