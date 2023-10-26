package Day15;

public class Q3_1_6 {
    public static void main(String[] args) {
        Terran t = new Terran();
        Zerg z = new Zerg();
        boolean check = true;
        int count  = 1;
        while(check){
            Marine m;
            //저그공격
            System.out.println((count++)+"턴 저그 공격");
            //1. 저그 공격자 추출
            if(z.turn % 2 == 0 && z.j !=null){
                System.out.println("저글링이 공격을 합니다.");
                Juggling j = z.goJugging();
                m = t.beAttackedTerran();
                m.hp -= j.attack;
            }
            else{
                System.out.println("히드라가 공격을 합니다.");
                Hydra h = z.goHydra();
                m = t.beAttackedTerran();
                m.hp -= h.attack;
            }
            //3. 테란 에너지 체크
            t.energyCheck();
            //4. 테란 게임 오버 체크
            check = t.gameOverCheck();
            if(check == false){
                System.out.println("저그가 승리");
                continue;
            }
            z.turn++;

            //테란공격
            System.out.println((count++)+"턴 테란 공격");
            //1. 테란 공격자 출동
            m = t.attackZerg();
            //2. 공격을 당할 저그 출동
            Unit u = z.beAttackedZerg();

            if(u instanceof Juggling){
                System.out.println("저글링인 공격을 당합니다.");
            }
            else if(u instanceof Hydra){
                System.out.println("히드라가 공격을 당합니다.");
            }
            else {
                System.out.println("공격대상이 없습니다.");
            }
            u.hp -= m.attack;
            //3. 저그 에너지 체크
            z.energyCheck();
            //4. 저그 게임 오버 체크
            check = z.gameOverCheck();

            if(check == false){
                System.out.println("테란이 승리");
            }
        }
    }
}
