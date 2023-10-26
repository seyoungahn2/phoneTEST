package Day07;

public class MethodTest4 {
    //스택구조설명
    static void a(){
        b();
        k();
        System.out.println("A");
    }
    static void b(){
        c();
        k();
        System.out.println("B");
    }

    static void c(){
        d();
        System.out.println("C");
    }

    static void d(){
        e();
        System.out.println("D");
    }

    static void e(){
        System.out.println("E");
    }

    static void k(){
        System.out.println("A");
    }




    public static void main(String[] args) {

        a();


    }



}
