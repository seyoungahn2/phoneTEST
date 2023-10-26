package Day13;

class Parent{
    Parent(){
        System.out.println("Parent 생성");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child 생성");
    }
}

public class InheriatanceTest_12 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
