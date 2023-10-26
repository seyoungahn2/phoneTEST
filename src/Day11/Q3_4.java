package Day11;

import java.util.Scanner;

class Pencil{
    String color;

    Pencil(String color){
        this.color = color;
    }
}

class Eraser{
    String color;
    Eraser(String color){
        this.color = color;
    }
}

class Pen{
    String color;

    Pen(String color){
        this.color = color;
    }
}

class Case{
    Pencil p1;
    Pencil p2;
    Eraser e;
    Pen pen1;
    Pen pen2;
}

class Student{
    String name;
    Case c;

    boolean checkPencil(){
        if(c.p1 !=null && c.p2 !=null){
            return true;
        }
        return false;
    }

    boolean checkEraser(){
        if(c.e != null){
            return true;
        }
        return  false;
    }
    boolean checkPen(){
        if(c.pen1 != null && c.pen2 != null){
            return  true;
        }
        return false;
    }

    Student(String name){
        this.name = name;
        c = new Case();
    }

    void casePrint(){
        System.out.println("색연필 1: "+c.p1.color);
        System.out.println("색연필 2: "+c.p2.color);
        System.out.println("지우개: "+c.e.color);
        System.out.println("펜1: "+c.pen1.color);
        System.out.println("펜2: "+c.pen2.color);
    }

}

class MunbangGu{
    Pencil[] p = new Pencil[4];
    Eraser[] e = new Eraser[2];
    Pen[] penArray = new Pen[4];

    MunbangGu(){
        String[] color = {"주황색","초록색","노란색","파란색"};
        String[] color2 = {"회색", "빨간색"};

        for(int i = 0;i<p.length;i++){
            p[i] = new Pencil(color[i]);
            penArray[i] = new Pen(color[i]);
        }
        for(int i = 0;i<e.length;i++){
            e[i] = new Eraser(color2[i]);
        }

    }

}

class Controller{
    void buyPencil(MunbangGu m, String color, Student student){
        int i;
        for(i = 0;i<m.p.length;i++){
            if(m.p[i] != null){
                if(m.p[i].color.equals(color)){
                    if(student.c.p1 == null){
                        student.c.p1 = m.p[i];
                    }
                    else{
                        student.c.p2 = m.p[i];
                    }

                    m.p[i] = null;
                    System.out.println(student.name+"학생이 샀습니다.");
                    break;
                }
            }
        }
        if(i == m.p.length){
            System.out.println("벌써 팔렸습니다.");
        }
    }
    void buyEraser(MunbangGu m, String color, Student student){
        int i;
        for(i = 0;i<m.e.length;i++){
            if(m.e[i] != null){
                if(m.e[i].color.equals(color)){
                    student.c.e = m.e[i];
                    m.e[i] = null;
                    System.out.println(student.name+"학생이 샀습니다.");
                    break;
                }
            }
        }
        if(i == m.e.length){
            System.out.println("벌써 팔렸습니다.");
        }
    }

    void buyPen(MunbangGu m, String color, Student student){
        int i;
        for(i = 0;i<m.penArray.length;i++){
            if(m.penArray[i] != null ){
                if(m.penArray[i].color.equals(color)){
                    if(student.c.pen1 == null){
                        student.c.pen1 = m.penArray[i];
                    }
                    else{
                        student.c.pen2 = m.penArray[i];
                    }

                    m.penArray[i] = null;
                    System.out.println(student.name+"학생이 샀습니다.");
                    break;
                }
            }
        }
        if(i == m.penArray.length){
            System.out.println("벌써 팔렸습니다.");
        }
    }
}

public class Q3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MunbangGu m = new MunbangGu();
        Controller c = new Controller();
        Student a = new Student("A학생");
        Student b = new Student("B학생");

        //1. A학생 연필사기
        while(!a.checkPencil()){
            System.out.println(a.name + "색연필 색깔을 골라 주세요 : ");
            String color = sc.next();

            if(color.equals("주황색") || color.equals("초록색") ||
                color.equals("노란색") || color.equals("파란색")){
                c.buyPencil(m,color,a);
            }else {
                System.out.println("잘못된 입력 입니다.");
            }
        }
        // B학생 연필사기
        while (!b.checkPencil()){
            System.out.println(b.name + "색연필 색깔을 골라 주세요 : ");
            String color = sc.next();

            if(color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")){
                c.buyPencil(m,color,b);
            }else {
                System.out.println("잘못된 입력 입니다.");
            }
        }
        while (!a.checkEraser()){
            System.out.println(a.name+"지우개 색깔을 골라주세요 : ");
            String color = sc.next();

            if(color.equals("빨간색") || color.equals("회색")){
                c.buyEraser(m,color,a);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        while (!b.checkEraser()){
            System.out.println(b.name+"지우개 색깔을 골라주세요 : ");
            String color = sc.next();

            if(color.equals("빨간색") || color.equals("회색")){
                c.buyEraser(m,color,b);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        while(!a.checkPen()){
            System.out.println(a.name + "펜 색깔을 골라 주세요 : ");
            String color = sc.next();

            if(color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")){
                c.buyPen(m,color,a);
            }else {
                System.out.println("잘못된 입력 입니다.");
            }
        }
        while(!b.checkPen()){
            System.out.println(b.name + "펜 색깔을 골라 주세요 : ");
            String color = sc.next();

            if(color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")){
                c.buyPen(m,color,b);
            }else {
                System.out.println("잘못된 입력 입니다.");
            }
        }
        a.casePrint();
        b.casePrint();
    }
}