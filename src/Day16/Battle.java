package Day16;

import java.util.Random;

public class Battle {

    int atkup = 0;
    Burf b = new Burf();
    Random r = new Random();
    //1. 버프 랜덤으로 동작
    void randomBurf(Unit u){
        int num = r.nextInt(3)+1;//1~3;
        switch (num){
            case 1:
                atkup=b.atkUp(u);
                break;
            case 2:
                b.heal(u);
                break;
            case 3:
                b.downHp(u);
                break;
            default:
                System.out.println("잘못된 랜덤 값입니다.");
                break;
        }
    }
    //2. 싸움
    void fight(Unit u1, Unit u2){
        u2.setHp(u2.getHp()- u1.getAtk());
        System.out.println(u1.getName()+"의 공격!!");
        System.out.println(u2.getName()+"의 체력이 "+u2.getHp()+"남았다.");
        u1.setAtk(u1.getAtk() - atkup);
        atkup = 0;
    }
}
