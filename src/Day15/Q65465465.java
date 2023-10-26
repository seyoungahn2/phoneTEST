package Day15;

class Unit11{
    int price;
    int energe;

    int atk;

    int def;

    String target;

    double speed;

    String type;


    Unit11(int price,int energe,int atk,int def,String target, double speed,String type){

        this.price= price;
        this.energe = energe;
        this.atk = atk;
        this.def = def;
        this.target = target;
        this.speed = speed;
        this.type = type;



    }


}

class Zergling extends Unit11{
    Zergling(){
        super(50,35,5,0,"지상",2.612,"지상,소형,생체");
    }
    void print(){
        System.out.println("저글링의 생산비용은 미네랄 "+super.price+"체력 "+super.energe+"공격력 "+super.atk+"방어력"+super.def
        +"공격대상 "+super.target+"이동속도 "+super.speed+"유닛 특성 "+super.type+" 입니다.");
    }
}

class Hydra1 extends Unit11{
    Hydra1(){
        super(100,80,10,0,"지상,공중",1.741,"지상, 중형, 생체");
    }

    void print(){
        System.out.println("히드라의 생산비용은 미네랄 "+super.price+"체력 "+super.energe+"공격력 "+super.atk+"방어력"+super.def
                +"공격대상 "+super.target+"이동속도 "+super.speed+"유닛 특성 "+super.type+" 입니다.");
    }
}


class Marin1 extends Unit11{
    Marin1(){
        super(50,50,6,0,"지상,공중",1.875,"지상,소형,생체");
    }

    void print(){
        System.out.println("히드라의 생산비용은 미네랄 "+super.price+"체력 "+super.energe+"공격력 "+super.atk+"방어력"+super.def
                +"공격대상 "+super.target+"이동속도 "+super.speed+"유닛 특성 "+super.type+" 입니다.");
    }
}


class TerranAtk{

}




public class Q65465465 {
    public static void main(String[] args) {

    }
}
