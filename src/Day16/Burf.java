package Day16;

import java.util.Random;

public class Burf {
    Random r = new Random();
    // 힐
    void heal(Unit u){
        //범위 0~300
        int healHp = r.nextInt(301);
        u.setHp(u.getHp() + healHp);
        System.out.println("버프 : "+u.getName()+"의 체력이 "+healHp+" 만큼 증가하였다.");
    }
    // 공격력 증가
    int atkUp(Unit u){
        //범위50~150
        int atkUp = r.nextInt(101)+50;
        u.setAtk(u.getAtk() + atkUp);
        System.out.println("버프 : "+u.getName()+"의 공격력이 "+atkUp+" 만큼 증가하였다.");
        return atkUp;
    }
    // 디버프
    void downHp(Unit u){
        //범위 100~300
        int healHp = r.nextInt(201)+100;
        u.setHp(u.getHp() - healHp);
        System.out.println("디버프 : "+u.getName()+"의 체력이 "+healHp+" 만큼 감소하였다.");
    }
}
