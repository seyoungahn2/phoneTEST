package Day14;

class Z{
    int k;
    Z(int a){

    }
    void def(){

    }
}
class Y extends Z{
    int k;
    Y(){
        super(5);
    }
    Y(int a){
        super(a);
    }

    void abc(){
        System.out.println(super.k); // 부모 변수 k
        System.out.println(k); //내 변수 k
        System.out.println(this.k); //내 변수 k
        def(); // 부모 메소드
        super.def(); // 부모 메소드
    }

}
public class SuperTest_5 {
}
