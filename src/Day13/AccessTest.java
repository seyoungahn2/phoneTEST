package Day13;

//default
class A{
    private int a; //private
    public  int b; // public

    void def(){
        abc();
    }
    private void abc(){

    }
}

public class AccessTest {
    public static void main(String[] args) {
        A a = new A();
        a.b = 20;
    }
}
