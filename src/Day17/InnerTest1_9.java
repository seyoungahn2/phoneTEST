package Day17;

class OutClass{
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass;
    public OutClass(){
        inClass = new InClass();
    }

    static class InStaticClass{
        int inNum = 100;
        static int SInNum = 200;

        void inTest(){
            //num = 10; 외부 인스턴스 변수 사용 불가능
            System.out.println("OutClass num = "+inNum+"(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = "+SInNum+"(내부 클래스 정적 변수)");
            System.out.println("OutClass sNum = "+sNum+"(외부 클래스 정적 변수)");
        }

        static void sTest(){
            System.out.println("OutClass sNum = "+sNum+"(외부 클래스 정적 변수)");
            System.out.println("OutClass sNum = "+SInNum+"(내부 클래스 정적 변수)");
        }
    }


    class InClass{
        int inNum = 100;
        //static int SInNum = 200; 인스턴스 내부클래스 static 변수 X

        void inTest(){
            System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = "+sNum+"(외부 클래스 정적 변수)");
        }
        //static void sTest(){
        //} 안됨
    }
    public void usingClass(){
        inClass.inTest();
    }
}

public class InnerTest1_9 {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메소드 호출");
        sInClass.inTest();
        System.out.println("정적 내부 클래스 정적 메소드 호출");
        OutClass.InStaticClass.sTest();
    }
}
