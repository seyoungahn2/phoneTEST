package Day15;

interface Accept{}
interface ParkPass{}

class Human10{

}
class Human20 implements Accept, ParkPass{

}
class Human30 implements Accept{

}
class Human40{

}

class Club{
    void pass(Accept a){
        System.out.println("공부하세요 나가요");
    }
}

class Park{
    void pass(ParkPass p){

    }
}
public class TestAbstract_8 {
    public static void main(String[] args) {
        Club c = new Club();
        Park p = new Park();
        Human10 h10 = new Human10();
        Human20 h20 = new Human20();
        Human30 h30 = new Human30();
        Human40 h40 = new Human40();

        //c.pass(h10);
        c.pass(h20);
        c.pass(h30);
        //c.pass(h40);

        //p.pass(h10);
        p.pass(h20);
        //p.pass(h30);
        //p.pass(h40);
    }
}
