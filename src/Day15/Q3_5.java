package Day15;

class Unit{
    int price;
    int hp;
    int attack;
    int defence;
    String target;
    double speed;
    String characteristic;

    Unit(int price,int hp, int attack, int defence, String target,
         double speed, String characteristic){
        this.price = price;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.target = target;
        this.speed = speed;
        this.characteristic = characteristic;
    }
}

class Juggling extends Unit{
    Juggling(){
        super(50, 35, 5, 0, "지상", 2.612, "지상,소형,생체");
    }
    void print() {
        System.out.println("저글링의 생산비용은 미네랄 :"+price+", 체력: "+hp+
                ", 공격력: "+attack+" 방어력: "+defence+
                "\n, 공격대상: "+target+", 이동속도: "+speed+", 유닛특성: "
                +characteristic);
    }
}

class Hydra extends Unit{
    Hydra(){
        super(100, 80, 10, 0, "지상,공중", 1.741, "지상,중형,생체");
    }
    void print() {//출력
        System.out.println("히드라의 생산비용은 미네랄 :"+price+", 체력: "+hp
                +", 공격력: "+attack+" 방어력: "+defence+
                "\n, 공격대상: "+target+", 이동속도: "+speed+
                ", 유닛특성: "+characteristic);

    }
}

class Marine extends Unit{
    Marine(){
        super(50, 50, 6, 0, "지상,공중", 1.875, "지상,소형,생체");
    }
    void print() {//출력
        System.out.println("마린의 생산비용은 미네랄 :"+price+
                ", 체력: "+hp+", 공격력: "+attack+" 방어력: "+defence+
                "\n, 공격대상: "+target+", 이동속도: "+speed+", 유닛특성: "
                +characteristic);

    }
}


class Terran{
    //1. 마린배열 객체 생성
    Marine[] m = new Marine[3];
    //2. 턴을 담는 변수 생성
    int turn = 0;
    //3. 마린 배열안에 객체 생성 -> 생성자
    Terran(){
        for(int i = 0;i<m.length;i++){
            m[i] = new Marine();
            m[i].print();
        }
    }
    //4. 저그한테 공격을 당하는 마린을 리턴하는 메소드
    Marine beAttackedTerran(){
        for(int i = 0;i<m.length;i++){
            if(m[i] != null){
                System.out.println("마린"+i+"번째가 공격을 당합니다.");
                return m[i];
            }
        }
        return null;
    }
    //5. 마린중에 누가 공격하는지 정해서 리턴하는 메소드
    Marine attackZerg(){
        if(m[0] != null || m[1] != null || m[2] !=null){
            while(m[turn % 3] ==null){
                turn++;
            }
            System.out.println("마린의 "+turn%3+"번째가 공격을 합니다.");
            return m[turn++ % 3];
        }
        else {
            return null;
        }
    }
    //6. 에너지를 체크해서 null변경을 해주는 메소드
    void energyCheck(){
        for(int i = 0;i<m.length;i++){
            if(m[i] !=null && m[i].hp <= 0){
                System.out.println("마린"+i+"번째가 사망했습니다.");
                m[i] = null;
            }
        }
    }
    //7. 게임을 종료를 알려주는 메소드
    boolean gameOverCheck(){
        for(int i = 0;i<m.length;i++){
            if(m[i]!=null){
                return true;
            }
        }
        return false;
    }
}
class Zerg{
    //1. 저글링 히드라 선언
    Juggling j;
    Hydra h;
    //2. turn 생성
    int turn = 0;
    //3. 객체 생성
    Zerg(){
        j = new Juggling();
        h = new Hydra();
        j.print();
        h.print();
    }
    //4. 맞을 친구나가
    Unit beAttackedZerg(){
        if(j != null){ // 널이 아니라면
            System.out.println("저글링 나간다."); // 저글링이 나간다 출력
            return j; // 리턴 j를 beAttackZerg로 보내준다 .
        }
        else if(h != null){ // h가 널이 아니라면
            System.out.println("히드라 나간다."); // 히드라가 출력
            return h; // h를 beAttacked Zerg로 리턴한다.
        }
        else{
            return null; // 둘다 널이면 널 리턴 .
        }
    }
    //5. 공격할 친구나가
    Juggling goJugging(){
        return j;
    }
    Hydra goHydra(){
        return h;
    }
    //6. 에너지 없으면 죽어
    void energyCheck(){
        if(j !=null && j.hp <= 0){
            System.out.println("저글링 사망");
            j = null;
        }
        if(h !=null && h.hp<=0){
            System.out.println("히드라 사망");
            h = null;
        }
    }
    //7. 게임종료 알려줘
    boolean gameOverCheck(){
        if(j!=null || h!=null){
            return true;
        }
        return false;
    }
}
public class Q3_5 {
    public static void main(String[] args) {
        Terran t = new Terran();
        Zerg z = new Zerg();
        boolean check = true;
        int count  = 1;
        while(check){
            //테란공격
            System.out.println((count++)+"턴 테란 공격");
            //1. 테란 공격자 출동
            Marine m = t.attackZerg();
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
                continue;
            }

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
            }
            z.turn++;
        }
    }
}

