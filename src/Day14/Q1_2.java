package Day14;

class Dino{
    int height;
    int kg;

    void print(){
        System.out.println("나는 공룡이다.");
    }
}

class TR extends Dino{
    TR(){
        height = 2;
        kg = 1;
    }
    void print(){
        System.out.println("나는 키"+height+"m 몸무게는 "+kg+"톤인 티라노사우르스다.");
    }
}

class TC extends Dino{
    TC(){
        height = 3;
        kg = 2;
    }
    void print(){
        System.out.println("나는 키"+height+"m 몸무게는 "+kg+"톤인 티리케라톱스다.");
    }
}

class Bu extends Dino{
    Bu(){
        height = 5;
        kg = 3;
    }
    void print(){
        System.out.println("나는 키"+height+"m 몸무게는 "+kg+"톤인 부경사우르스다.");
    }
}

public class Q1_2 {

    static void run(Dino d){
        d.print();
    }

    public static void main(String[] args) {
        TR tr = new TR();
        TC tc = new TC();
        Bu bu = new Bu();

        run(tr);
        run(tc);
        run(bu);
    }
}
