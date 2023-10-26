package Day10;

class Person{
    int age;
    String name;
    boolean isMarried;
    int childrenCount;

    void print(){
        System.out.println("이 사람의 나이 " + age);
        System.out.println("이 사람의 이름 "+name);
        System.out.println("이 사람의 결혼 여부 " + isMarried);
        System.out.println("이 사람의 자녀 수 "+childrenCount);
    }
}

public class Q1_2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "James";
        p1.age = 40;
        p1.isMarried = true;
        p1.childrenCount = 3;

        p1.print();

        Person p2 = new Person();
        p2.name = "Aliy";
        p2.age = 20;
        p2.isMarried = false;
        p2.childrenCount = 0;

        p2.print();
    }
}
