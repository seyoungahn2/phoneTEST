package Day15;

interface Repairable{}
interface Heal{}
class Unit1{
    int attack;
    int hitPoint;
    final int MAX_HP; // 상수

    Unit1(int hp,int attack){
        MAX_HP = hp;
        this.attack = attack;
    }
}
class GroundUnit extends Unit1{
    GroundUnit(int hp, int attack){
        super(hp,attack);
    }
}
class AirUnit extends Unit1{
    AirUnit(int hp, int attack){
        super(hp,attack);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150,10);
        hitPoint = MAX_HP;
    }

    // Object클래스 메소드 재정의
    public String toString(){
        return "Tank";
    }
}

class SCV extends GroundUnit implements Repairable, Heal{
    SCV(){
        super(60,5);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r){
        if(r instanceof  Unit1){
            Unit1 u = (Unit1) r;
            if(u !=null && u.MAX_HP != u.hitPoint){
                u.hitPoint++;
            }
        }
    }

}
public class TestAbstract_7 {
    public static void main(String[] args) {
        Tank t = new Tank();
        SCV scv = new SCV();
        SCV scv1 = new SCV();
        Marine m = new Marine();

        System.out.println(t);
        System.out.println(m);

        scv.repair(t);
        scv1.repair(scv);
        //scv.repair(m);

    }
}
