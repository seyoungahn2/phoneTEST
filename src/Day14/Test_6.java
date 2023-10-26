package Day14;
/*
final class Kor{
    final void abc(){

    }
}
class Jpn extends Kor{
    void abc(){

    }
}
*/
public class Test_6 {
    public static void main(String[] args) {
        Z z = new Z(5);
        Z z1 = new Z(5);

        if(z.equals(z1)){
            System.out.println("z와 z1은 같습니다.");
        }
        else{
            System.out.println("z와 z1은 같지 않습니다.");
        }
    }
}
