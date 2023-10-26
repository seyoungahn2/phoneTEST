package Day06;

public class MethodTest1_6 {

    //1. 주고 받고
    static String printHello(String name){
        return "안녕하세요"+name+"님";
    }

    //2. 주고 안받고
    static  int sum(){
        int a = 10;
        int b = 20;
        return  a+b;
    }

    //3. 안주고 받고
    static void outputName(String name){
        System.out.println("안녕하세요"+name+"님");
    }

    //4. 안주고 안받고
    static void printBye(){
        System.out.println("바이~~~~~~~");
    }

    public static void main(String[] args) {
        //1. 주고 받고
        String str = printHello("홍길동");
        System.out.println(str);
        str=printHello("호랑이");
        System.out.println(str);
        //2. 주고 안받고
        int result = sum();
        System.out.println(result);
        //3. 안주고 받고
        outputName("강아지");
        //4. 안주고 안받고
        printBye();

        //outputName(printHello("사슴"));
    }
}
