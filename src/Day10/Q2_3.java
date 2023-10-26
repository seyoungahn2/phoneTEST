package Day10;

class Pencil{
    String color;

    void write(){
        System.out.println("쓰기 기능은 "+color+"색 연필로 적습니다.");
    }
}

class Eraser{
    String menu;

    void  eraser(){
        System.out.println("지우개를 "+menu+"의 제품으로 지웁니다.");
    }
}

class Pen{
    String[] cm = new String[2];

    void write(){
        System.out.println("펜을 "+cm[0]+" 제품의 "+cm[1]+"색으로 씁니다.");
    }
}

public class Q2_3 {
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.color = "빨간";
        Pencil p2 = new Pencil();
        p2.color = "파란";
        Pencil p3 = new Pencil();
        p3.color = "주황";
        Pencil p4 = new Pencil();
        p4.color = "노란";

        p1.write();
        p2.write();
        p3.write();
        p4.write();

        Eraser e1 = new Eraser();
        Eraser e2 = new Eraser();

        e1.menu = "잠자리";
        e2.menu = "모닝글로리";

        e1.eraser();
        e2.eraser();

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        pen1.cm[1] = "검정색";
        pen1.cm[0] = "모나미";

        pen2.cm[1] = "초록색";
        pen2.cm[0] = "제트스트림";

        pen3.cm[1] = "베이비블루";
        pen3.cm[0] = " 워터맨";

        pen1.write();
        pen2.write();
        pen3.write();
    }
}
