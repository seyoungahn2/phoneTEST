package Day10;

import java.util.Random;
import java.util.Scanner;

class Dog{
    String color;
    int kg;

    Dog(String c, int k){
        color = c;
        kg = k;
    }

    void bowl(){
        System.out.println(color +" , 무게 "+kg+"kg 개가 짖는다.");
    }
}
class Cat{
    String color;
    int kg;

    void yayong(){
        System.out.println(color +" , 무게 "+kg+"kg 고양이가 야옹한다.");
    }
}
class Bird{
    String color;
    int kg;

    void fly(){
        System.out.println(color +" , 무게 "+kg+"kg 새가 날아간다.");
    }
}

public class Q3_4 {
    public static void main(String[] args) {
        Dog d1 = new Dog("분홍색",12);
        Dog d2 = new Dog("빨간색",23);

        d1.bowl();
        //d1.bowl();
        d2.bowl();

        Cat c1 = new Cat();
        Cat c2 = new Cat();

        c1.color = "검은색";
        c1.kg = 7;
        c2.color = "오렌지색";
        c2.kg = 8;

        c1.yayong();
        c2.yayong();

        Bird b = new Bird();
        b.color ="무지개색";
        b.kg = 4;
        b.fly();
    }
}
